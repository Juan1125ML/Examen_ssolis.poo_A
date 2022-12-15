/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo();
        System.out.println("Ingrese la marca");
        v1.setMarca(leer.next());
        System.out.println(v1.toString());
    }
    
}
