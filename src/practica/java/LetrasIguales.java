
package practica.java;

import java.io.IOException;



public class LetrasIguales {
    public static void main(String[] args) throws IOException {
      
        System.out.println("Ingrese una letra");
        char U1 = (char)System.in.read();
        System.in.read();
        char U2 = (char)System.in.read();
        
        if(U1 == U2)
            System.out.println(" ambas letras son iguales");
        else 
            System.out.println("ambas letras no son iguales");
    }
}
