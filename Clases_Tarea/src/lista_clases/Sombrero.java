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
public class Sombrero {
    
    public String color, tamanio,material;
    public double diametro;
    
    public Sombrero(){
        this.color = "";
        this.tamanio = "";
        this.material = "";
        this.diametro = 0.0;
   }
    
    public Sombrero(String color, String tamanio, String material, double diametro){
        this.color = color;
        this.tamanio = tamanio;
        this.material = material;
        this.diametro = diametro;
    }
}
