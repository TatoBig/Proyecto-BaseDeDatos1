/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tato
 */
public class Conexion {
    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","fairiesandelves");
            if(connection != null){
                System.out.println("Se realizo la conexi?n");
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
