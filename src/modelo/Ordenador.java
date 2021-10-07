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
public abstract class Ordenador {
    private double precio;
    private int codigo;
    private String slogan;

    public Ordenador() {
    }

    public Ordenador(double precio, int codigo, String slogan) {
        this.precio = precio;
        this.codigo = codigo;
        this.slogan = slogan;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the slogan
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * @param slogan the slogan to set
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
    
    
    public String obtenerDatos(){
        return "Codigo: " + this.codigo + "\n" + 
               "Precio: " + this.precio + "\n" +
               "Slogan: " + this.slogan + "\n";
    }
    
    public abstract String obtenerInfo();
    
}
