/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author depot
 */
public class Alimento {
    
    private double peso;
    private double calorias;
    private String sabor;
    private String color;
    private String textura;
    private double cantidad_grasa;

    public Alimento() {
        this.peso = 0.0;
        this.calorias = 0.0;
        this.sabor = "Desconocido";
        this.color = "Desconocido";
        this.textura = "Desconocido"; 
    }

    public Alimento(double peso, double calorias, String sabor, String color, String textura) {
        this.peso = peso;
        this.calorias = calorias;
        this.sabor = sabor;
        this.color = color;
        this.textura = textura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCalorias() {
        return this.calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return this.textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public double getCantidad_grasa() {
        return this.cantidad_grasa;
    }

    public void setCantidad_grasa(double cantidad_grasa) {
        this.cantidad_grasa = cantidad_grasa;
    }
    
    
}
