/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public class Portatil extends Ordenador{
    private double peso;

    public Portatil() {
    }

    public Portatil(double peso, double precio, int codigo) {
        super(precio, codigo, "Ideal para sus viajes");
        this.peso = peso;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String obtenerInfo() {
        return this.obtenerDatos() + 
               "Peso: " + this.peso + "\n";
    }
       
    
    
}
