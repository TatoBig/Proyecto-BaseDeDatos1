/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

/**
 *
 * @author aleja
 */
public class Venta {
    private String query1;
    private String query2;
    private Integer cantidad;

    public String getQuery1() {
        return query1;
    }

    public String getQuery2() {
        return query2;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setQuery1(String query1) {
        this.query1 = query1;
    }

    public void setQuery2(String query2) {
        this.query2 = query2;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
