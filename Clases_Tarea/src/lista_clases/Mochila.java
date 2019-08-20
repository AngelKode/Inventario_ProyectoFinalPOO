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
public class Mochila {
    
    public double peso;
    public String marca, color,material_construccion;
    
    public Mochila(){
       this.peso = 0.0;
       this.marca = "";
       this.color = "";
       this.material_construccion = "";
    }
    public Mochila(double peso, String marca, String color, String material_construccion){
        this.peso = peso;
        this.marca = marca;
        this.color = color;
        this.material_construccion = material_construccion;
    }
}
