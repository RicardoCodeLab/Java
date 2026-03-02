package Ejercicios_Bucles;
// Pedir 10 numeros y escribir la suma total
import java.util.Scanner;

public class Ejercicio_11_Bucles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int acum=0;
        for(int i=1;i<=10;i++){
          System.out.println("Ingresar numero");
          int num = sc.nextInt();
          acum+=num;
        }System.out.println("La suma total es "+acum);
    }
}
