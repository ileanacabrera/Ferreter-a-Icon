/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ilean
 */
public class ventas {
    private String nombre_producto;
    private int precio;
    private int cantidad;
    private String descrripcion;
    private String proveedor;

    public ventas(String nombre_producto, int precio, int cantidad, String descrripcion, String proveedor) {
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descrripcion = descrripcion;
        this.proveedor = proveedor;
    }

    public ventas(int precio, int cantidad, String descrripcion, String proveedor) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.descrripcion = descrripcion;
        this.proveedor = proveedor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
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

    public String getDescrripcion() {
        return descrripcion;
    }

    public void setDescrripcion(String descrripcion) {
        this.descrripcion = descrripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

   
    
}
