package Ejercicios_Bucles;
// Pedir un numero y calcular el factorial
import java.util.Scanner;

public class Ejercicio_13_Bucles {
    public static void main(String[] args) {
        int factorial=1,acum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero");
        int num=sc.nextInt();
        while(factorial<=num){
            acum*=factorial;
            factorial++;
        }
        System.out.println("El factorial del numero !"+num+" es: "+acum);
    }
}
