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
public class Directivo extends Empleado{
    private String categoria;

    public Directivo() {
    }

    public Directivo(String categoria, Double sueldo, String nombre, Integer cedula, Integer edad) {
        super(sueldo, nombre, cedula, edad);
        this.categoria = categoria;
    }



    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Datos del directivo: \n"
                +"categoria: "+getCategoria();
    }

   
}
