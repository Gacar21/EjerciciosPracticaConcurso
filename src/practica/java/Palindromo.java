
package practica.java;

import java.util.Scanner;


public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el polindromo");
        String palabra;
        char[] palindromo;
        int izq, der;
        palabra = scanner.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ","");
        
     
        palindromo = palabra.toCharArray();
        izq = 0;
        der = palindromo.length -1;
        
        
        while(izq < der){
            if(palindromo[izq] == palindromo[der]){
                der --;
                izq ++;
            }else {
                System.out.println("no son palindromos");
                break;
            }
        }
        if(izq == der){
            System.out.println("si es palindromo");
        }
    }
}
