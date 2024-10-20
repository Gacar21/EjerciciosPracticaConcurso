
package practica.java;

import java.util.Scanner;

public class SumadelosPrimerosN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor N");
        int N = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            
             suma = suma +i;
             
            System.out.println("su suma es:" + suma);
        }
            
          
        
    
    }
}
