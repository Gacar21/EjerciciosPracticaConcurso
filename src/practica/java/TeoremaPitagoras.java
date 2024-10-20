
package practica.java;

import java.util.Scanner;


public class TeoremaPitagoras {
    public static void main(String[] args) {
        // hip^2 = raiz(co^2 + ca^2)
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el cateto opuesto del triangulo rectangulo ");
        int Co = scanner.nextInt();
        System.out.println("Digite el cateto adyacente del triangulo rectangulo");
        int Ca = scanner.nextInt();
        
        int Suma = (Co*Co)+ (Ca * Ca);
        double Raiz = Math.sqrt(Suma);
        
        System.out.println("La hipotenusa es " + Raiz + " del triangulo rectangulo");
        
        
        System.out.println(Math.pow(Co, 3));
    }
}

// math.pow(Co, valor que desea multiplicar) me regresa el valor el doble 

