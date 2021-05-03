/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

/**
 *
 * @author Tato
 */
public class VentaHasProducto {
    private Integer Venta_id;
    private Integer Producto_id;
    private Integer Cantidad_Vendida;
    private Integer Precio;
    private Integer Subtotal;
    private String Nombre;

    public Integer getVenta_id() {
        return Venta_id;
    }

    public VentaHasProducto(Integer Venta_id, Integer Producto_id, Integer Cantidad_Vendida, Integer Precio, Integer Subtotal, String Nombre) {
        this.Venta_id = Venta_id;
        this.Producto_id = Producto_id;
        this.Cantidad_Vendida = Cantidad_Vendida;
        this.Precio = Precio;
        this.Subtotal = Subtotal;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setVenta_id(Integer Venta_id) {
        this.Venta_id = Venta_id;
    }

    public Integer getProducto_id() {
        return Producto_id;
    }

    public void setProducto_id(Integer Producto_id) {
        this.Producto_id = Producto_id;
    }

    public Integer getCantidad_Vendida() {
        return Cantidad_Vendida;
    }

    public void setCantidad_Vendida(Integer Cantidad_Vendida) {
        this.Cantidad_Vendida = Cantidad_Vendida;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    public Integer getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Integer Subtotal) {
        this.Subtotal = Subtotal;
    }

    
}
