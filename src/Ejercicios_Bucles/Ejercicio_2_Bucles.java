package Ejercicios_Bucles;
import java.util.Scanner;
// Ingresa un numero para saber si es positivo o negativo
// Si es 0 se cierra el programa
public class Ejercicio_2_Bucles {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa numero a evaluar");
        int num = sc.nextInt();
        while(num!=0){
            if(num>=0){
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }
            System.out.println("Ingresa numero a evaluar");
            num = sc.nextInt();
        }System.out.println("El numero es 0");
    }
    
}
