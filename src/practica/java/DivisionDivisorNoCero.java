
package practica.java;

import java.util.Scanner;


public class DivisionDivisorNoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor1");
        double numerador = scanner.nextDouble();
        System.out.println("Ingrese el valor2");
        double denominador = scanner.nextDouble();
        
        if(denominador !=0)
            System.out.println("su division es "+ numerador/denominador);
        else 
            System.out.println("el denominador no puede ser cero");
    }
}
