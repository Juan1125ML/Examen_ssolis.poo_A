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
public class Cliente extends Persona{
    private Integer telefono;

    public Cliente() {
    }

    public Cliente(Integer telefono, String nombre, Integer cedula, Integer edad) {
        super(nombre, cedula, edad);
        this.telefono = telefono;
    }


    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "datos del cliente: \n"
                +"telefono: "+getTelefono();
    }

   
    
}