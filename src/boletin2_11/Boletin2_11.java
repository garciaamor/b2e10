
package boletin2_11;

import java.util.Scanner;


public class Boletin2_11 {

    
    public static void main(String[] args) {
        float euros, bill100, bill20, bill5, mon1;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce la cantidad de dinero : ");
        euros=obx.nextFloat();
        bill100=(int) euros/100;
        bill20=(int) euros%100/20;
        bill5=(int) euros%20/5;
        mon1=(int) euros%5;
        System.out.println("Billetes de 100 : "+ bill100);
        System.out.println("Billetes de 20 : "+ bill20);
        System.out.println("Billetes de 5 : "+ bill5);
        System.out.println("Monedas de 1 : "+mon1);
       
    }
    
}
