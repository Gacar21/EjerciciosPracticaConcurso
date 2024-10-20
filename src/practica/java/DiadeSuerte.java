
package practica.java;

import java.util.Scanner;


public class DiadeSuerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte la fecha de nacimiento en el orden Dia Mes Año");
        int Dia = scanner.nextInt();
        int Mes = scanner.nextInt();
        int año = scanner.nextInt();
        
        int suma = Dia + Mes + año;
        int suerte = (suma/1000)+(suma/100%10)+(suma/10%10)+(suma%10);
        
        System.out.println("Tu fecha de nacimiento es " + Dia + " " + Mes + " " + año);
        System.out.println("tu numero de la suerte es " + suerte);
    
    }   
}
