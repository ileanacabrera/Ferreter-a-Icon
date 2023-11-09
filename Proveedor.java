/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ilean
 */
public class Proveedor {
    
    private int id_proveedor;
    private String pro_nombre;
    private String pro_apellido;
    private int numero;
    private String correo_elec;

    public Proveedor(int id_proveedor, String pro_nombre, String pro_apellido, int numero, String correo_elec) {
        this.id_proveedor = id_proveedor;
        this.pro_nombre = pro_nombre;
        this.pro_apellido = pro_apellido;
        this.numero = numero;
        this.correo_elec = correo_elec;
    }

    public Proveedor(String pro_nombre, String pro_apellido, int numero, String correo_elec) {
        this.pro_nombre = pro_nombre;
        this.pro_apellido = pro_apellido;
        this.numero = numero;
        this.correo_elec = correo_elec;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_apellido() {
        return pro_apellido;
    }

    public void setPro_apellido(String pro_apellido) {
        this.pro_apellido = pro_apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo_elec() {
        return correo_elec;
    }

    public void setCorreo_elec(String correo_elec) {
        this.correo_elec = correo_elec;
    }
    
    
    
}
