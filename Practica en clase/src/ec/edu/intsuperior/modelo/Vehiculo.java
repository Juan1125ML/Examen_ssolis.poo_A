package ec.edu.intsuperior.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private Boolean placa;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Boolean placa, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(Boolean placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Boolean getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Datos del Vehiculo: \n"
                + "Marca: "+getMarca()+"\n"
                + "Modelo: "+getModelo()+"\n"
                + "Placa: "+getPlaca()+"\n"
                + "Color: "+getColor();
    }
  
    
}
