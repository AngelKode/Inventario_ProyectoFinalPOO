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
public class Bicicleta {
    
    public String marca, frenos, material;
    public double peso;
    
    public Bicicleta(){
        this.marca = "";
        this.frenos = "";
        this.material = "";
        this.peso = 0.0;
    }
    
    public Bicicleta(String marca, String frenos, String material, double peso){
        this.marca = marca;
        this.frenos = frenos;
        this.material = material;
        this.peso = peso;
    }
}
