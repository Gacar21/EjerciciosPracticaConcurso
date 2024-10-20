
package practica.java;

import java.io.IOException;
import java.util.Scanner;

public class SiesMayuscula {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ingrese una letra");
     
        
        char letra1 = (char) System.in.read();
        
        if(Character.isUpperCase(letra1))
            System.out.println("Es una letra mayuscula");
        else 
            System.out.println("no es una letra mayuscula");
    }
}

//Character.isUpperCase() (para ver si la primera letra es mayuscula o minuscula
