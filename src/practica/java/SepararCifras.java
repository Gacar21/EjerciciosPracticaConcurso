
package practica.java;

import java.util.Scanner;


public class SepararCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el valor N de 3 cifras");
        int N = scanner.nextInt();
        
        System.out.println("primera cifra de N es " + (N/100));
        System.out.println("Segunda cifra de N es " + (N/10)%10);
        System.out.println("Tercera cifra de N es " + (N%10));
    }
}
