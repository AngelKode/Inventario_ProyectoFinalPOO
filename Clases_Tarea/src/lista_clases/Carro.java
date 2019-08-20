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
public class Carro {
    
    public String marca, material;
    public double peso;
    public int capacidadPasajeros;
    
    public Carro(){
        this.marca = "";
        this.material = "";
        this.capacidadPasajeros = 0;
        this.peso = 0.0;
    }
        
    public Carro(String marca, String material, double peso, int capacidadPasajeros){
        this.marca = marca;
        this.material = material;
        this.peso = peso;
        this.capacidadPasajeros = capacidadPasajeros;
     }
 }
