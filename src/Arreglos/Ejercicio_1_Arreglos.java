package Arreglos;
// Leer 5 números guardar en arreglo y mostrarlos en orden
import java.util.Scanner;

public class Ejercicio_1_Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arreglo = new float [5];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingresar elemento");
            arreglo[i]=sc.nextFloat();
        }
        for(float muestra:arreglo){
            System.out.println(muestra);
        }
    }  
}
