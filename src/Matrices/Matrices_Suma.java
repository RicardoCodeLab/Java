package Matrices;
// Sumar 2 matrices y luego mostrar las 3 matrices
import java.util.Scanner;
public class Matrices_Suma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar cantidad de filas");
        int filas=sc.nextInt();
        System.out.println("Ingresar cantidad de columnas");
        int columnas=sc.nextInt();
        int matrizA[][]=new int[filas][columnas];// Declaramos matriz A
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Ingresar elemento del arreglo A"+"["+i+"] "+"["+j+"]");
                matrizA[i][j]=sc.nextInt();
            }
        }
        int matrizB[][]=new int[filas][columnas];// Declaramos matriz B
        for(int x=0;x<filas;x++){
            for(int y=0;y<columnas;y++){
                System.out.println("Ingresar elemento del arreglo B"+"["+x+"] "+"["+y+"]");
                matrizB[x][y]=sc.nextInt();
            }
        }
        // SUMA DE 2 ARREGLOS
        int matrizSuma[][]=new int [filas][columnas]; // Declaramos matriz suma
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matrizSuma[i][j]=matrizA[i][j]+matrizB[i][j];
            }
        }
        
        // IMPIRMIMOS LA MATRIZ A
        System.out.println("La matriz A es:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matrizA[i][j]);
            }
            System.out.println("");
        }
        // IMPIRMIMOS LA MATRIZ B
        System.out.println("La matriz B es:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matrizB[i][j]);
            }
            System.out.println("");
        }
        // IMPIRMIMOS LA MATRIZ SUMA
        System.out.println("La matriz Suma es:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matrizSuma[i][j]);
            }
            System.out.println("");
        }
    }
}
