/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class Conexion {
    static Conexion conex=null;
    
    public static Conexion conexion() {
        String user="root";
        String passwd="root";
        String url="jbdc:mysql://localhost:3306/procesadorarosasbimal?serverTimezone=UTC";
        try {
           conex=(Conexion) DriverManager.getConnection(url, user, passwd);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    return conex;
    }
}
