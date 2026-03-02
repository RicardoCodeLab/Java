package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio_6_Bucles {
    public static void main(String[] args) {
       // Pedir numeros hasta teclear un 0 y mostrar la suma
       // de los numeros ingresados
       Scanner sc = new Scanner(System.in);
       int i=0;
       System.out.println("Ingresa numero");
       int num = sc.nextInt();
       while (num!=0){
           i+=num; //acumulador
           System.out.println("Ingresa numero");
           num = sc.nextInt();
       }
        System.out.println("La sumatoria es: "+i);
    }
}
