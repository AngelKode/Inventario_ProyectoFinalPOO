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
public class Audifonos {
    
    public String marca, calidad_sonido, nombre;
    public double peso, longitud;
    
    public Audifonos(){
        this.marca = "";
        this.calidad_sonido = "";
        this.nombre = "";
        this.peso = 0;
        this.longitud = 0;
    }
    
    public Audifonos(String marca, String calidad_sonido, String nombre, double peso, double longitud){
        this.marca = marca;
        this.calidad_sonido = calidad_sonido;
        this.nombre = nombre;
        this.peso = peso;
        this.longitud = longitud;
    }
}
