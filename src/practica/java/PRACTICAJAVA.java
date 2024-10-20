
package practica.java;

import java.util.Scanner;


public class PRACTICAJAVA {
// radio y longitud
   
    public static void main(String[] args) {
       double PI = Math.PI * 2;
      
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese el RADIO de la circunferencia");
        int Radio = scanner.nextInt();
        int Radio2 = Radio*Radio;
       
        System.out.println("el valor del radio ingresado es " + Radio);
        System.out.println(" su longitud es " + (PI * Radio));
        System.out.println(" su area es " + (PI * Radio2));
    }
    
}
