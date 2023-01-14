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
public class  Persona  {
    private String nombre;
    private Integer cedula;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, Integer cedula, Integer edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return  "datos de la persona: \n"
                +"nombre: " +getNombre()+"\n"
                + "cedula: " +getCedula()+"\n"
                + "edad: " +getEdad();
    }

   


    
     
    
}
