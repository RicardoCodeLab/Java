package Matrices;
import java.util.Scanner;
public class Ejercicio_7_Matrices {
    public static void main(String[] args) {
       // Crear matriz cuadrada, todos los elementos deben ser 0
       // Todos los bordes deben ser 1.
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingresar la cantidad de filas y columnas");
       int cantidad = sc.nextInt();
       int matriz[][]=new int[cantidad][cantidad];
       for(int i=0;i<cantidad;i++){
           for(int j=0;j<cantidad;j++){
               if((i==(cantidad-1) || i==0) || (j==0 || j==(cantidad-1)) ){
                   matriz[i][j]=1;
               }else{
                   matriz[i][j]=0;
               }
           }
       }
       
       // IMPRIMIMOS LA MATRIZ
        System.out.println("La matriz es la siguiente: ");
       for(int i=0;i<cantidad;i++){
           for(int j=0;j<cantidad;j++){
               System.out.print(matriz[i][j]);
           }
           System.out.println("");
       }
    }
}
