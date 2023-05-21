/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio09;

import entidades.Guerrero;
import entidades.Arquero;
import entidades.Mago;


/**
 *
 * @author Ronaldo
 */
public class Laboratorio09 {


    public static void main(String[] args) {
        
        Arquero arquero = new Arquero("Zeus", 200, 1, 8, 98);
        arquero.mostrarDatos();
        
        Guerrero guerrero = new Guerrero("Leo", 300, 2, 45, 30);
        guerrero.mostrarDatos();
        
        Mago mago = new Mago("Estano", 250, 2, 150, 97);
        mago.mostrarDatos();
        
    }
    
}
