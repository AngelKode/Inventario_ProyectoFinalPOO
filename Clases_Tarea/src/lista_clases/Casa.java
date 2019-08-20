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
public class Casa {
    
    public String propietario, lugarEstablecido;
    public int cantidadPisos;
    public double precio;
    
    public Casa(){
       this.propietario = "";
       this.lugarEstablecido = "";
       this.cantidadPisos = 0;
       this.precio = 0.0;
    }
    public Casa(String propietario, String lugarEstablecido, int cantidadPisos, double precio){
        this.propietario = propietario;
        this.lugarEstablecido = lugarEstablecido;
        this.cantidadPisos = cantidadPisos;
        this.precio = precio;
    }
}
