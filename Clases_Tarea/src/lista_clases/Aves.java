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
public class Aves {
    
    public double peso, altura;
    public String color, raza;
    
    public Aves(){
        this.peso = 0.0;
        this.color = "";
        this.raza = "";
        this.altura = 0.0;
    }
    
    public Aves(double peso,double altura, String color, String raza){
       this.peso = peso;
       this.altura = altura;
       this.color = color;
       this.raza = raza;
    }
    
}
