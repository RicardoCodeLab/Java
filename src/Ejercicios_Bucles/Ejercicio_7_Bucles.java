package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_7_Bucles {
    public static void main(String[] args) {
       int acum=0, promedio, i = 0;
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa numero");
        int num = sc.nextInt();
        while (num != 0){
            i++;
            acum +=num;
            System.out.println("Ingresa numero");
            num = sc.nextInt();
        }
        promedio=acum/i;
        System.out.println("El promedio es "+ promedio);
        System.out.println("Ingresaste el número 0");
    }
}