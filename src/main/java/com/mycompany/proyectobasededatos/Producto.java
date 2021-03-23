/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

/**
 *
 * @author Diego
 */
public class Producto {
    private int id;
    private int costo;
    private String nombre;
    private int crecio_Venta;
    private int categoria_id;
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto(int id, int costo, String nombre, int crecio_Venta, int categoria_id) {
        this.id = id;
        this.costo = costo;
        this.nombre = nombre;
        this.crecio_Venta = crecio_Venta;
        this.categoria_id = categoria_id;
    }

    public Producto(int costo, String nombre, int crecio_Venta, int categoria_id) {
        this.costo = costo;
        this.nombre = nombre;
        this.crecio_Venta = crecio_Venta;
        this.categoria_id = categoria_id;
        
    }
    
    public Producto(){
        
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCrecio_Venta() {
        return crecio_Venta;
    }

    public void setCrecio_Venta(int crecio_Venta) {
        this.crecio_Venta = crecio_Venta;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", costo=" + costo + ", nombre=" + nombre + ", crecio_Venta=" + crecio_Venta + ", categoria_id=" + categoria_id +  ", cantidad= " + cantidad +'}';
    }
    
    
}
