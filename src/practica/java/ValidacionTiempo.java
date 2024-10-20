
package practica.java;

import java.util.Scanner;

public class ValidacionTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 valores");
        int hora = scanner.nextInt();
        int minutos =scanner.nextInt();
        int segundos =scanner.nextInt();
        
        if(hora>= 0 && hora<= 24)
            System.out.println("el primer dato se tomo como Horas y es valido");
        else 
            System.out.println("el primer dato se tomo como Horas y no es valido");
        if(minutos >= 0 && minutos<= 60)
            System.out.println("el segundo dato se tomo como Minutos y es valido");
        else 
            System.out.println("el segundo dato se tomo como minutos y no es valido");
        if(segundos >= 0 && segundos<= 60 )
            System.out.println("el tercer dato se tomo como segundos y es valido");
        else 
             System.out.println("el tercer dato se tomo como segundos y no es valido");
        
        if(hora>= 0 && hora<= 24 && minutos >= 0 && minutos<= 60 && segundos >= 0 && segundos<= 60 )
            System.out.println("la hora es correcta");
        else 
            System.out.println("la hora no es correcta");
    }
}
