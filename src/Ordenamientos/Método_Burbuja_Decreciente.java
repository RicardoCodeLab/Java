package Ordenamientos;
import java.util.Scanner;
public class Método_Burbuja_Decreciente {
    public static void main(String[] args) {
        int cambio;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de elementos");
        int cantidad=sc.nextInt();
        int[] arreglo = new int[cantidad];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingresar elemento");
            arreglo[i]=sc.nextInt();
        }
        // MÉTODO BURBUJA DECRECIENTE
        for(int i=0;i<(arreglo.length-1);i++){
            for(int j=0;j<(arreglo.length-1);j++){
                if(arreglo[j]<arreglo[j+1]){
                    cambio=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=cambio;
                }
            }
        }
        // Imprimimos el resultado del método Burbuja
        System.out.println("El resultado del metodo burbuja");
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
        
        // Impresión de forma CRECIENTE
        for(int i=(arreglo.length-1);i>=0;i--){ // para saber cuantas pasadas
            System.out.println(arreglo[i]);        
        }
    }
}
