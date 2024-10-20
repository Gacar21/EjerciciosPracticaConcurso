
package practica.java;

import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero entero");
        int numero = scanner.nextInt();
        
        System.out.println("el numero ingresado es " + numero + " y ");
        if(numero%2 == 0)
            System.out.println("es par");
        else 
            System.out.println("no es par");
    }
}
