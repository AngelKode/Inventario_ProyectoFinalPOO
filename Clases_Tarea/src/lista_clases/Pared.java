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
public class Pared {
    
    public double grueso,altura;
    public String material;
    
    public Pared(){
       this.grueso = 0.0;
       this.altura = 0.0;
       this.material = "";
    }
    
    public Pared(double grueso, double altura, String material){
        this.grueso = grueso;
        this.altura = altura;
        this.material = material;
    }
}
