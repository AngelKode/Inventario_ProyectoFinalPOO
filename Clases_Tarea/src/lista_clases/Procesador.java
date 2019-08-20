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
public class Procesador {
    
    public int cantidad_nucleos, cantidad_hilos;
    public double frecuencia;
    public String marca;
    
    public Procesador(){
        this.cantidad_nucleos = 0;
        this.cantidad_hilos = 0;
        this.frecuencia = 0.0;
        this.marca = "";
    }
    
    public Procesador(int canidad_nucleos, int cantidad_hilos, double frecuencia, String marca){
        this.cantidad_nucleos = cantidad_nucleos;
        this.cantidad_hilos = cantidad_hilos;
        this.frecuencia = frecuencia;
        this.marca = marca;
    }
}
