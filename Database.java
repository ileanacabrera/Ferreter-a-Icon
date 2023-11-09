/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ilean
 */
public class Database {
    private final String URL="jdbc:mysql:// localhost:3307/";
    private final String user="dbileana";
    private final String passaword="123456";
     
    
    private Connection conexion;
    
    
    public Database(){
        try {
            
            conexion=DriverManager.getConnection(URL, user, passaword);
            System.out.println( "conexion Establecido");
            
        }catch (SQLException e){
            System.out.println("Error de conexion");
            e.printStackTrace();
            
        }
            
    }
    
    public int Actualizar (String consulta){
       try{
    Statement st=conexion.createStatement();
    return st.executeUpdate(consulta);
    
       }catch (SQLException e){
           e.printStackTrace();
         
       }
       return 0;
    } 
    private List organizarDatos(ResultSet rs){
        List filas =new ArrayList();
try{
    
int numColumnas=rs.getMetaData().getColumnCount();
while(rs.next()){ 
    Map<String, Object> renglon=new HashMap();
    for(int i=1; i<numColumnas; i++){
    String nombreCampo=rs.getMetaData().getCatalogName(i);
    Object valor=rs.getObject(nombreCampo);
    renglon.put(nombreCampo,valor);
   
}
filas.add(renglon);         
       }
    }catch(SQLException e){
    
}
       return filas;     
        }
    public List Listar(String consulta){
      ResultSet rs=null;
      List resultado=new ArrayList();
      try{
      Statement st=conexion.createStatement();
      rs=st.executeQuery(consulta);
      resultado=organizarDatos(rs);
      
      }catch(SQLException e){
          System.out.println("No se realizo la conexion");
          e.printStackTrace();
      }
      return resultado;
    }public void cerrarConexion(){
          try{
              conexion.close();
          }catch(SQLException e){
              e.printStackTrace();
          }
      }
    }

    
    
    

