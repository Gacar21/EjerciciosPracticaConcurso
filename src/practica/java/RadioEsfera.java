
package practica.java;

import java.util.Scanner;


public class RadioEsfera {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
     
        System.out.println("Digite el radio de la esfera");
        int Radio = scanner.nextInt();
        
        
        
        System.out.println("el volumen de la esfera es " + ((4.0/3)*Math.PI* Math.pow(Radio, 3)));
    }
}
