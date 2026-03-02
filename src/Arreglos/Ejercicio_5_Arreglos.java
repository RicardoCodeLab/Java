package Arreglos;
// Leer por teclado dos tablas de 5 numeros y mezclarla
// en un tercer arreglo 
import java.util.Scanner;

public class Ejercicio_5_Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio1=0, inicio2=0;
        int[] arreglo1=new int[5];
        for(int i=0;i<=4;i++){
            System.out.println("Ingresar elemento arreglo 1");
            arreglo1[i]=sc.nextInt();
       }
        int[] arreglo2=new int[5];
        for(int i=0;i<=4;i++){
            System.out.println("Ingresar elemento arreglo 2");
            arreglo2[i]=sc.nextInt();
       }
       int[] arreglo3=new int[10];
       int j=0;
       for(int i=0;i<=4;i++){
           arreglo3[j]=arreglo1[i];
           j++;
           arreglo3[j]=arreglo2[i];
           j++;
       }
       for(int Alonso:arreglo3){
           System.out.println(Alonso);
       }
    }
}
