/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Persona p1=new Persona();
        System.out.println("ingrese el nombre");
        p1.setNombre(leer.next() );
        System.out.println("ingrese la cedula");
        p1.setCedula(leer.nextInt(30));
        System.out.println("ingrese la edad");
        p1.setEdad(leer.nextInt());
        
        System.out.println(p1.toString());
        
        
        Empleado emp1=new Empleado();
        System.out.println("\n");
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("ingrese el nombre");
        emp1.setNombre(leer.next());
        System.out.println("ingrese la cedula");
        emp1.setCedula(leer.nextInt(30));
        System.out.println("ingrese la edad");
        emp1.setEdad(leer.nextInt());
        System.out.println("ingrese el sueldo");
        emp1.setSueldo(leer.nextDouble());
        
        System.out.println(emp1.toString());
        
        Cliente cli1=new Cliente();
        System.out.println("\n");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("ingrese el nombre");
        cli1.setNombre(leer.next());
        System.out.println("ingrese la cedula");
        cli1.setCedula(leer.nextInt(30));
        System.out.println("ingrese la edad");
        cli1.setEdad(leer.nextInt());
        System.out.println("ingrese el telefono");
        cli1.setTelefono(leer.nextInt(30));
        
        System.out.println(cli1.toString());
        
        Directivo dir1=new Directivo();
        System.out.println("\n");
        System.out.println("DATOS DEL DIRECTIVO");
        System.out.println("ingrese el nombre");
        dir1.setNombre(leer.next());
        System.out.println("ingrese la cedula");
        dir1.setCedula(leer.nextInt(30));
        System.out.println("ingrese la edad");
        dir1.setEdad(leer.nextInt());
        System.out.println("ingrese la categoria");
        dir1.setCategoria(leer.next());
        
        System.out.println(dir1.toString());
        
        Empresa empr1=new Empresa();
        System.out.println("\n");
        System.out.println("DATOS DE LA EMPRESA");
        System.out.println("ingrese el nombre del cliente");
        empr1.setNombre(leer.next());
        System.out.println("ingrese el nombre de la empresa");
        empr1.setEmpNombre(leer.next());
        System.out.println("ingrese la cedula");
        empr1.setCedula(leer.nextInt(30));
        System.out.println("ingrese la edad");
        empr1.setEdad(leer.nextInt());
        System.out.println("ingrese el telefono");
        empr1.setTelefono(leer.nextInt(30));
        
        System.out.println(empr1.toString());
    }
   
    
}
