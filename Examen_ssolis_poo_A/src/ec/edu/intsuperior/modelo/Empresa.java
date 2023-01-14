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
public class Empresa extends Cliente{ 
    private String empNombre;

    public Empresa() {
    }

    public Empresa(String empNombre, Integer telefono, String nombre, Integer cedula, Integer edad) {
        super(telefono, nombre, cedula, edad);
        this.empNombre = empNombre;
    }


    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    @Override
    public String toString() {
        return "Datos de la empresa: \n"
                +"Nombre de la empresa: "+getEmpNombre();
    }

   
    
          
}
