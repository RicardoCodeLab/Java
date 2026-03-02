package Ordenamientos;
import java.util.Scanner;
public class Método_Burbuja_Creciente {
    public static void main(String[] args) {
        int cambio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos");
        int cantidad = sc.nextInt();
        int[] arreglo = new int[cantidad];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingresar elemento al arreglo");
            arreglo[i]=sc.nextInt();
        }
        
        // MÉTODO BURBUJA CRECIENTE
        for(int i=0;i<(arreglo.length-1);i++){ // para saber cuantas pasadas
            for(int j=0;j<(arreglo.length-1);j++){ //Ordenar elementos
                if(arreglo[j]>arreglo[j+1]){
                    cambio = arreglo[j]; // nuestra variable cambio es la posición 1
                    arreglo[j]=arreglo[j+1]; //posicion actual = número de la posición siguiente
                    arreglo[j+1]=cambio;
                }
            }
        }
        // Imprimimos el resultado del método Burbuja
        System.out.println("El resultado del metodo burbuja");
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
        
        // Impresión de forma DECRECIENTE
        for(int i=(arreglo.length-1);i>=0;i--){ // para saber cuantas pasadas
            System.out.println(arreglo[i]);
        }
    } 
}
