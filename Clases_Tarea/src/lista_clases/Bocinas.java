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
public class Bocinas {
    
    public String marca, potencia, frecuencia;
    public double peso;
    public Bocinas(){
        this.marca = "";
        this.potencia = "";
        this.frecuencia = "";
        this.peso = 0.0;
    }
    
    public Bocinas(String marca, String potencia, String frecuencia,double peso){
        this.marca = marca;
        this.potencia = potencia;
        this.peso = peso;
        this.frecuencia = frecuencia;
    }
}
