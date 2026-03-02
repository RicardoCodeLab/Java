// Leer por teclado una serie de numeros enteros. La aplicación
// debe indicarnos si esta organizado de forma creciente, decreciente
// o si están desordenados.
package Arreglos;
import java.util.Scanner;

public class Ejercicio_6_Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean creciente= false, decreciente=false;
        System.out.println("Ingresar cantidad de elementos");
        int elementos=sc.nextInt();
        int[] arreglo1 = new int[elementos];
        for(int i=0;i<arreglo1.length;i++){
            System.out.println("Ingresar elementos");
            arreglo1[i]=sc.nextInt();
        }
        //Validamos la forma de la serie
        for(int i=0;i<arreglo1.length-1;i++){
            if(arreglo1[i]<arreglo1[i+1]){
                creciente=true;
            }
            if(arreglo1[i]>arreglo1[i+1]){
                decreciente=true;
            }
        }
        if(creciente == true && decreciente== false){
            System.out.println("Arreglo creciente");
        }else if(creciente == false && decreciente==true){
            System.out.println("Arreglo decreciente");
        }else{
            System.out.println("Arreglo Desordenado");
        }
        for(int Alonso:arreglo1){
            System.out.print(Alonso);
        }
    }
}
