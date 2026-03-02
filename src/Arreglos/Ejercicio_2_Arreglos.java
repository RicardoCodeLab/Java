package Arreglos;
// Leer 5 números, guardarlos en arreglo y mostrar en orden inverso
import java.util.Scanner;

public class Ejercicio_2_Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arreglo = new float[5];
        for(int i=0; i<arreglo.length;i++){
            System.out.println("Ingresar elementos");
            arreglo[i]=sc.nextFloat();
        }
        for(int i=4;i>=0;i--){
            System.out.println(arreglo[i]);
        }
    }
}
