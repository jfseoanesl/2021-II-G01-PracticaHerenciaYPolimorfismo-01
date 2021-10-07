/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
        Ordenador pc = new Portatil(200, 1000, 12345) ; // upcasting
        //imprimirOrdenador(pc);
        
        Ordenador pc2 = new Sobremesa("Micro ATX", 500, 56789);
        //imprimirOrdenador(pc2);
        
        Ordenador listado[] = new Ordenador[2];
        listado[0] = pc;
        listado[1] = pc2;
        imprimirListado(listado);
        
        
    }
    
    public static void imprimirOrdenador(Ordenador ordenador){
        System.out.println("Informacion del ordenador: ");
        System.out.println("--------------------------------------");
        String tipo = (ordenador instanceof Portatil)? "Portatil":"Sobremesa";
        System.out.println("Tipo: " + tipo);
        System.out.println(ordenador.obtenerInfo());
    }
    
    public static void imprimirListado(Ordenador[] lista){
        System.out.println("** Lista de ordenadores **");
        for(int i=0; i< lista.length;i++){
            imprimirOrdenador(lista[i]);
        }
    }
    
}
