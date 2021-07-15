/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author WILLIAMS
 */
public class Cuadrado extends Formas {
     
   public Cuadrado(){
        
     
       establecerDibujar("Cuadrado");
        establecerCalcular("Area");
        
        
           }  

    @Override
   public String obtenerInformacionFormas() {
    return "AREA";
    }
}
