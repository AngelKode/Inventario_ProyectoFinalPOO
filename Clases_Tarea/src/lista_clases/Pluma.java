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
public class Pluma {
    
    public double largo;
    public String color_tinta,marca,material;
    
    public Pluma(){
        this.largo = 0.0;
        this.color_tinta = "";
        this.marca = "";
        this.material = "";
    }
    
    public Pluma(double largo, String color_tinta, String marca, String material){
        this.largo = largo;
        this.color_tinta = color_tinta;
        this.marca = marca;
        this.material = material;
    }
            
}
