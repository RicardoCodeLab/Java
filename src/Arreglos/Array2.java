package Arreglos;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nelementos;
        System.out.println("Ingresar cantidad elementos para arreglo");
        nelementos=sc.nextInt();
        int[] arreglo= new int[nelementos];// Declaramos arreglo y tamaño
        // Bucle para llenar arreglo
        for(int i=0;i<nelementos;i++){
            System.out.println("Ingresar elemento");
            arreglo[i]=sc.nextInt();
        }
        for(int i=0;i<nelementos;i++){
            System.out.println(arreglo[i]);
        }
    }
}
