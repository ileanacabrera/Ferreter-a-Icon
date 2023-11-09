/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ilean
 */
public class Producto {
    
    private int id_producto;
    private String pro_nombre;
    private String tipo_prod;
    private int precio;
    private int cantidad;
    private String descripcion_prod;

    public Producto(int id_producto, String pro_nombre, String tipo_prod, int precio, int cantidad, String descripcion_prod) {
        this.id_producto = id_producto;
        this.pro_nombre = pro_nombre;
        this.tipo_prod = tipo_prod;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion_prod = descripcion_prod;
    }

    public Producto(String pro_nombre, String tipo_prod, int precio, int cantidad, String descripcion_prod) {
        this.pro_nombre = pro_nombre;
        this.tipo_prod = tipo_prod;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion_prod = descripcion_prod;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getTipo_prod() {
        return tipo_prod;
    }

    public void setTipo_prod(String tipo_prod) {
        this.tipo_prod = tipo_prod;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion_prod() {
        return descripcion_prod;
    }

    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }
    
    
    
}
