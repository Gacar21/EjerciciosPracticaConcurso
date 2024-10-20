
package practica.java;

import java.util.Scanner;


public class SiesMultiplo {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("Ingrese el digito entero");
            int N = scanner.nextInt();
            
            if((N%10) == 0)
                System.out.println("Es multiplo de " + 10);
            else 
                System.out.println(" No es multiplo de " + 10);
            
    }
}
