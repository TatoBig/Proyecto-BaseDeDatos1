/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobasededatos;

import static java.lang.Integer.parseInt;

/**
 *
 * @author luis2
 */
public class Comprimir {
   
    public String RLE(String Cadena)
    {
        Integer sumar=0;
        String nueva="";
        char letra=Cadena.charAt(0);
        for(int i=0; i<=Cadena.length(); i++)
        {
            if(i==Cadena.length())
            {
                nueva=nueva+sumar.toString()+Cadena.charAt(i-1);
                
            }else
            if(letra==Cadena.charAt(i))
            {
                sumar++;
            }
            else
            {
                nueva=nueva+sumar.toString()+Cadena.charAt(i-1);
                sumar=1;
                letra=Cadena.charAt(i);
                
            }
            
        }
                
     return nueva;
    }
    
    public String Encriptado(String cadena)
    {
        byte a,e;
        int b, d,g=cadena.length();
        String letra, adicional="", nueva="", devolver="";
        for(int i=0; i<cadena.length(); i++)
        {
           a=(byte)cadena.charAt(i);
           b=a;
           letra=Integer.toBinaryString(b).toString();
           for(int j=0; j<(7-letra.length()); j++)
        {
           adicional=0+adicional;
        }
           letra=adicional+letra;
           for(int c=0; c<letra.length(); c++)
        {
            if(c==letra.length()-2 || c==letra.length()-1)
            {
                if(letra.charAt(c)=='0')
                {
                    adicional=adicional+1;    
                }
                else
                {
                    adicional=adicional+0;    
                }
            }else
            {
            adicional=adicional+letra.charAt(c);                
            }
            
        }
           letra=adicional;
           adicional="";
           d=parseInt(letra, 2);
           nueva=nueva+d;
           e=Byte.parseByte(nueva);
           nueva="";
           devolver=devolver+(char)e;
         //   System.out.println(devolver+"---"+i+"---"+g);
        //System.out.println(a+" --  "+b+"     "+letra);
        
        }
        System.out.println(devolver+"+++++++++");
        return devolver;
    }
    public String Descomprimir(String Encriptado)
    {
        String devolver="";
        int cantidad;
        for(int i=0; i<Encriptado.length(); i++)
        {
            String b=""+Encriptado.charAt(i);
            cantidad=Integer.parseInt(b);
            System.out.println(cantidad);
            i++;
            for(int j=0; j<cantidad;j++)
            {
                devolver=devolver+Encriptado.charAt(i);
            }
        }
        return devolver;
    }
}