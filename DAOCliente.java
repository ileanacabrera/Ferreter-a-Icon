/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.*;
/**
 *
 * @author ileane,
            String cliente_apellido, String direccion, int numero,
 */
public class DAOCliente {
    public cliente Insertar(String nombre,
            String apellido, String direccion, int numero,
            String correo_electronico, java.sql.Date fechaNac) {
        String transaccion = "INSET INTO Autor (id_cliente, nombre, apellido, direccion, numero, correo_electronico) VALUES('"
                + nombre + "', '"
                + apellido + "', '" 
                + direccion + "', '" 
                + numero + "', '"
                + correo_electronico + "')'";
        
        if (new DataBase().Actualizar(transaccion)< 0) {
            return new cliente(nombre, apellido, direccion,
            numero, correo_electronico);
        }
        return null;
    }
    public int Actualizar(int id_cliente, String nombre,
            String apellido, String direccion, int numero,
            String correo_electronico ) {
        String nombres = null;
        String apellidos = null;
        String dirreccion = null;
        String idcliente = null;
        
        String transaccion = "UPDATE Autor SET nombres='"
                + nombres + "', apellidos='"
                + apellidos + "', email='"
                + dirreccion + "', numero='"
                + idcliente;
        
        return new Database() .Actualizar(transaccion);
        

        public List ObtenerDatos() {
            String transaccion ="SELECT * FROM cliente";
            
            List<Map> registros = new Database().Listar(transaccion);
            List<Map>cliente = new ArrayList();
            
            for (Map registro : registros) {
                cliente cli = new cliente ((int) registro.get("idcliente"),
                (String)registro.get("nombre"),
                (String)registro.get("apellido"),
                (String)registro.get("numero"),
                (java.sql.Date) registro.get("correo"));
                clientes.add(cli);
            }
            return cliente;
            public int Eliminar(int id){
              String transaccion = "DELETE FROM Autor WHERE idcliente='"+ id +"'";
              
              return new Database().Actualizar(transaccion);
            }
        }
                
                
    }
}
