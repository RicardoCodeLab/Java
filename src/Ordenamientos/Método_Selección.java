package Ordenamientos;
import java.util.Scanner;
public class Método_Selección {
    public static void main(String[] args) {
        int aux, min, elementos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos");
        elementos = sc.nextInt();
        int[] arreglo = new int[elementos];
        
        for(int i=0;i<elementos;i++){
            System.out.println("Ingresar elementos");
            arreglo[i]=sc.nextInt();
        }
        
        // MÉTODO DE SELECCIÓN
        for(int i=0;i<elementos;i++){ // recorrer el arreglo
            min=i; // guardamos posición menor
            for(int j=i+1; j<elementos;j++){ // for para encontrar el elemento menor
                if(arreglo[j]<arreglo[min]){
                    min=j; // posición del elemento menor
                }
            }
            // Intercambio de posicion
            aux=arreglo[i];
            arreglo[i]=arreglo[min];
            arreglo[min]=aux;
        }
        System.out.println("Mostramos el arreglo de forma ascendente");
        for(int i=0;i<elementos;i++){
            System.out.print(arreglo[i]+"-");
        }
    }
}
