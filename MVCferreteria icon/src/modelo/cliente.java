package modelo;

/**
 *
 * @author ilean
 */
public class cliente {
    
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int numero;
    private String correo_electronico;

    public cliente(int id_cliente, String cliente_nombre, String cliente_apellido, String direccion, int numero, String correo_electronico) {
        this.id_cliente = id_cliente;
        this.nombre = cliente_nombre;
        this.apellido = cliente_apellido;
        this.direccion = direccion;
        this.numero = numero;
        this.correo_electronico = correo_electronico;
    }

    public cliente(String cliente_nombre, String cliente_apellido, String direccion, int numero, String correo_electronico) {
        this.nombre = cliente_nombre;
        this.apellido = cliente_apellido;
        this.direccion = direccion;
        this.numero = numero;
        this.correo_electronico = correo_electronico;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCliente_nombre() {
        return nombre;
    }

    public void setCliente_nombre(String cliente_nombre) {
        this.nombre = cliente_nombre;
    }

    public String getCliente_apellido() {
        return apellido;
    }

    public void setCliente_apellido(String cliente_apellido) {
        this.apellido = cliente_apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
    
    

    
            
        }
          
              
            
    


