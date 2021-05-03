/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

import static com.mycompany.proyectobasededatos.Login.usuarioID;
import static java.lang.Integer.parseInt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luis2
 */
public class Comprimir {
   public boolean sha1(String input,String contra) throws NoSuchAlgorithmException {
        
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         System.out.println(sb.toString());
         String Regreso=""+sb.toString();
         
         byte[] result1 = mDigest.digest(contra.getBytes());
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < result1.length; i++) {
            sb1.append(Integer.toString((result1[i] & 0xff) + 0x100, 16).substring(1));
        }
         System.out.println(sb1.toString());
         String Contra=""+sb1.toString();
         
         Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cnx = conexion.getConnection()){
            String query = "SELECT Usuario,Contraseña,Usuario_id FROM contraseña";
            ps = cnx.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                String usu=""+rs.getString("Usuario").toString();
                boolean flag=false;
                String cont=""+rs.getString("Contraseña").toString();
                usuarioID=rs.getString("Usuario_id").toString();
                for(int i=0;i<Regreso.length();i++)
                {
                    if(usu.length()==Regreso.length())
                    {
                        if(usu.charAt(i)==Regreso.charAt(i))
                        {
                            if(usu.charAt(i)==Regreso.charAt(i) && Regreso.length()-1==i)
                            {
                            System.out.println("Usuario Encontrado");
                            flag=true;
                            }
                        }
                        else
                        {
                            System.out.println("Usuario Invalido");
                            return false;
                        }
                    }
                }
                if(flag)
                {
                    flag=false;
                    for(int i=0;i<Contra.length();i++)
                {
                    if(cont.length()==Contra.length())
                    {
                        if(cont.charAt(i)==Contra.charAt(i))
                        {
                            if(cont.charAt(i)==Contra.charAt(i) && Contra.length()-1==i){
                            System.out.println("Contraseña Correcta");
                            flag=true;
                            }
                        }
                        else
                        {
                            System.out.println("Contraseña Incorrecta");
                            return false;
                        }
                    }
                }
                            if(flag)
                            {
                                return true;
                            }
                }
                
            }
        } catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
}