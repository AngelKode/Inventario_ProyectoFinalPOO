/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraylist;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author depot
 */
public class EjercicioArrayList {
    public static void main(String[] args) {
       //Haciendo la instancia del objeto ArrayList
        ArrayList<String> personas = new ArrayList<>();
        
        //Preguntando en pantalla al usuario que ingrese la cantidad de personas a ingresar
        String cantidadPersonas = JOptionPane.showInputDialog("Cuantas personas vas a ingresar?: ");
        int cantidad = Integer.parseInt(cantidadPersonas);
        
        //Guardando los datos que el usuario ingrese
        for(int i=1;i<=cantidad;i++){
           personas.add(JOptionPane.showInputDialog("Persona " + i + ": "));
        }
        //Mostrando los datos que ingresó
        JOptionPane.showMessageDialog(null, "Las personas que ingresaste son: " + personas);
        personas.add(2, "Lola");//Agregando una nueva persona en el indice 2 del array
        JOptionPane.showMessageDialog(null, "Las personas que ingresaste son: " + personas);
        personas.clear();//Vaciando el arraylist
    }   
}
