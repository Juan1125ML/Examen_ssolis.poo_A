/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Pc
 */
public class Empleado extends Persona{
    private Double sueldo;

    public Empleado() {
    }

    public Empleado(Double sueldo, String nombre, Integer cedula, Integer edad) {
        super(nombre, cedula, edad);
        this.sueldo = sueldo;
    }


    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Datos del empleado: \n"
                +"sueldo: "+getSueldo();
    }

 
    
}
