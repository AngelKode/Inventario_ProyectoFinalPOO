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
public class Gato {
    
    public String raza,nombre;
    public double peso,longitud;
    
    public Gato(){
        this.raza = "";
        this.nombre = "";
        this.peso = 0.0;
        this.longitud = 0.0;
    }
    public Gato(String raza, String nombre, double peso, double longitud){
        this.raza = raza;
        this.nombre = nombre;
        this.peso = peso;
        this.longitud = longitud;
        
    }
}
