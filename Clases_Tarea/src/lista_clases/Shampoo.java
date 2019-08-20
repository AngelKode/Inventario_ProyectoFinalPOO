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
public class Shampoo {
    
    public String color, olor, marca;
    public double cantidad;
    
    public Shampoo(){
        this.color = "";
        this.olor = "";
        this.marca = "";
        this.cantidad = 0.0;
    }
    
    public Shampoo(String color,String olor, String marca, double cantidad){
        this.color = color;
        this.olor = olor;
        this.marca = marca;
        this.cantidad = cantidad;
    }
}
