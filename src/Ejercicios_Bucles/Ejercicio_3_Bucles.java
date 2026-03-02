package Ejercicios_Bucles;
// Ingresar numeros y determinar si es par o impar 
// hasta ingresar 0.
import java.util.Scanner;

public class Ejercicio_3_Bucles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar numero");
        int num=sc.nextInt();
        while(num!=0){
            if(num%2==0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
            System.out.println("Ingresar numero");
            num=sc.nextInt();
        }
        System.out.println("El numero es 0");
    }
    
}
