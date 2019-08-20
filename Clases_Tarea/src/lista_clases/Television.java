/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_clases;

/**
 *
 * @author depot
 */
public class Television {
    
    public String marca, color;
    public double peso;
    public int cantidad_pixeles;
    
    public Television(){
        this.marca = "";
        this.color = "";
        this.peso = 0.0;
        this.cantidad_pixeles = 0;
    }
    
    public Television(String marca, String color, double peso, int cantidad_pixeles){
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.cantidad_pixeles = cantidad_pixeles;
    }
    
}
