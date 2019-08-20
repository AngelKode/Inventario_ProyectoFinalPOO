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
public class Pantalon {
    
    public String material_construccion,marca,color;
    public double largo,peso;
    
    public Pantalon(){
        this.material_construccion = "";
        this.marca = "";
        this.color = "";
        this.largo = 0.0;
        this.peso = 0.0;
    }
    
    public Pantalon(String material_construccion, String marca, String color, double largo, double peso){
        this.material_construccion = material_construccion;
        this.marca = marca;
        this.color = color;
        this.largo = largo;
        this.peso = peso;
    }
}
