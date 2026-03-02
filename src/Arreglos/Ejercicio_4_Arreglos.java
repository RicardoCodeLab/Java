package Arreglos;
// Leer 10 números guardar en arreglo y mostrar de forma alternada
import java.util.Scanner;

public class Ejercicio_4_Arreglos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[]numeros=new float[10];
        int inicio=0; // indice inicio
        int fin =numeros.length-1; // indice final
        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingresar elementos");
            numeros[i]=sc.nextFloat();
        }
        while (inicio<fin){
            // Imprime el elemento del inicio y luego el del fin
            System.out.println(numeros[inicio]);
            System.out.println(numeros[fin]);
            // Aumenta el indice de inicio y disminuye el final
            inicio++;
            fin--;
        }
        //Si el arreglo fuera impar, imprimiríamos el elemento central que queda
        if(inicio==fin){
            System.out.println(numeros[inicio]);
        }
    }
}
