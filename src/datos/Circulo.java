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
public class Circulo extends Formas {
    
    public Circulo(){
        establecerDibujar("Radio");
        
        establecerCalcular("Radio");
        
        
    }

    @Override
   public String obtenerInformacionFormas() {
        return "RADIO"; 
        
    }
    
    
    
}
