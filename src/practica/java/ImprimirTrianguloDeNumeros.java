
package practica.java;

import java.util.Scanner;

public class ImprimirTrianguloDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite un valor de 5 digitos");
        int N = scanner.nextInt();
        
        System.out.println(N/10000);
        System.out.println(N/1000);
        System.out.println(N/100);
        System.out.println(N/10);
        System.out.println(N);
        
        System.out.println(N%10);
        System.out.println(N%100);
        System.out.println(N%1000);
        System.out.println(N%10000);
        System.out.println(N);
        
        
    }
            
}
