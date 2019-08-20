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
public class Playera {
    
    public String material,talla,color;
    public double peso;
    
    public Playera(){
        this.material = "";
        this.talla = "";
        this.color = "";
        this.peso = 0.0;
    }
    
    public Playera(String material, String talla, String color, double peso){
        this.material = material;
        this.talla = talla;
        this.color = color;
        this.peso = peso;
    }
}
