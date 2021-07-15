
package datos;

public abstract class Formas {
    
    private String Dibujar;
    private String Calcular;
          
    public Formas(){
      
        }
    public void establecerDibujar(String Dibujar){
        this.Dibujar = Dibujar;
    }
    public String obtenerDibujar(){
        return this.Dibujar;       
    } 
    public void establecerCalcular(String Calcular){
        this.Calcular = Calcular;
    }
    public String obtenerCalcular(){
        return this.Calcular;
            
    }
    public void imprimirInformacion(){
     
        System.out.println("Dibujar: " + Dibujar);
        System.out.println("Calcular: " + Calcular);      
    }
    abstract String obtenerInformacionFormas();  
}
