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
public class Triangulo extends Formas {
    public Triangulo(){
        
       
        establecerDibujar("Triangulo");
         establecerCalcular("Area");
        
           }

    @Override
   public String obtenerInformacionFormas() {
       return "ANGULO";
    }
    
}
