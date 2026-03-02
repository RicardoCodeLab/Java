package Ejercicios_Bucles;
// pedir numeros hasta que se introduzca uno negativo
// mostrar la media de estos números ingresado

import java.util.Scanner;

public class Ejercicio_8_Bucles {
    public static void main(String[] args) {
        int i=0, acum=0,prom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int num = sc.nextInt();
        while(num>=0){
            i++;
            acum+=num;
            System.out.println("Ingresar numero (no negativo)");
            num = sc.nextInt();
        }  
        if(acum==0){
            System.out.println("No puede sacarle el promedio");
        }else{
            prom=acum/i;
            System.out.println("Ingresaste un numero negativo");
            System.out.println("El promedio es: "+prom);
        }
    }
}
