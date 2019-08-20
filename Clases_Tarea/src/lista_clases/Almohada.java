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
public class Almohada {
    
    public String marca,material, suavidad;
    public int peso;
    
    public Almohada(){
        this.marca = "Sin marca";
        this.material = "Sin material";
        this.suavidad = "Sin suavidad";
        this.peso = 0;
    }
    
    public Almohada(String marca,String material, String suavidad,int peso){
        this.marca = marca;
        this.material = material;
        this.suavidad = suavidad;
        this.peso = peso;
    }
}
