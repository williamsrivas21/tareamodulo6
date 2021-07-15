
package principaltarea;

import datos.Circulo;
import datos.Cuadrado;
import datos.Lineas;
import datos.Triangulo;

public class Principaltarea {
    public static void main(String[] args) {
         
        Circulo circulo = new Circulo();
       Lineas  lineas = new  Lineas();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado  = new Cuadrado();
   
    System.out.println(circulo.obtenerInformacionFormas());
    circulo.imprimirInformacion();
    
    System.out.println(lineas.obtenerInformacionFormas());
    lineas.imprimirInformacion();
    
    System.out.println( triangulo.obtenerInformacionFormas());
    triangulo.imprimirInformacion();
    
    System.out.println(  cuadrado.obtenerInformacionFormas());
    cuadrado.imprimirInformacion();
    
     }
}
