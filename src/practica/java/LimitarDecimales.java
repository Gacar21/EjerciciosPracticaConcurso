
package practica.java;

import java.text.DecimalFormat;
public class LimitarDecimales {

    public static void main(String[] args) {
        double a = 15;
        double b = 7;
        
        double suma = a / b;
        System.out.println(suma);
        DecimalFormat decimales2 = new DecimalFormat("#.00");
        System.out.println("con DecimalFormat " +  decimales2.format(suma));
        
    }
}

