package Ejercicios_Bucles;
// Ingresar un numero y que te brinde desde el 1 al numero
import java.util.Scanner;

public class Ejercicio_9_Bucles {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresar numero");
        int num = sc.nextInt();
        while(num>=0 && i<num){
            i++;
            System.out.println(i);
        }
    }
    
}
