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
public class Cuaderno {
    
    public double peso;
    public String material, marca;
    public int cantidadHojas;
    
    public Cuaderno(){
       this.peso = 0.0;
       this.material = "";
       this.marca = "";
       this.cantidadHojas = 0;
    }
    public Cuaderno(double peso, String material, String marca, int cantidadHojas){
        this.peso = peso;
        this.material = material;
        this.marca = marca;
        this.cantidadHojas = cantidadHojas;
    }
}
