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
public class Sobremesa extends Ordenador {
    private String tipoTorre;

    public Sobremesa() {
    }

    public Sobremesa(String tipoTorre, double precio, int codigo) {
        super(precio, codigo, "El que mas pesa, pero el que menos cuesta");
        this.tipoTorre = tipoTorre;
    }

    /**
     * @return the tipoTorre
     */
    public String getTipoTorre() {
        return tipoTorre;
    }

    /**
     * @param tipoTorre the tipoTorre to set
     */
    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    @Override
    public String obtenerInfo() {
       return this.obtenerDatos() + "Tipo Torre: " + this.tipoTorre + "\n";
    }

    
    
    
}
