package Ejercicios_Bucles;
import java.util.Scanner;
public class Ejercicio_1_Bucles {
    public static void main(String[] args) {
        //Leer un número y mostrar su cuadrado, repetir el proceso
        //hasta que se introduzca un número negativo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero entero positivo");
        int num = sc.nextInt();
        while(num>=0){
            System.out.println((int)Math.pow(num, 2));
            System.out.println("Ingresar numero");
            num = sc.nextInt();
        }System.out.println("Programa Finalizado");
    }
}
