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
public class Estudiante {
    
    public String nombre,sexo;
    public int edad;
    public double altura;
    
    public Estudiante(){
       this.nombre = "";
       this.sexo = "";
       this.edad = 0;
       this.altura = 0.0;
    }
    
    public Estudiante(String nombre, String sexo, int edad, double altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
    }
}