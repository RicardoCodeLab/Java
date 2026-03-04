package Matrices;
//Crear una matriz, mostrar la suma de cada fila y de cada columna
import java.util.Scanner;
public class Ejercicio_5_Matrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar la cantidad de filas y columnas");
        int cantidad=sc.nextInt();
        int matriz[][]=new int[cantidad][cantidad];
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                System.out.println("ingresar elemento de la matriz: "+"["+i+"]"+"["+j+"]");
                matriz[i][j]=sc.nextInt();
            }
        }
        // HALLAR LA SUMA DE CADA FILA 
        System.out.println("La suma de filas es: ");
        for(int i=0;i<cantidad;i++){
            int sumafila = 0;
            for(int j=0;j<cantidad;j++){
                sumafila+=matriz[i][j];
            }
            System.out.println("La suma de la fila "+i+" es: "+sumafila);
        }
        // HALLAR LA SUMA DE CADA COLUMNA 
        System.out.println("La suma de columnas es: ");
        for(int j=0;j<cantidad;j++){
            int sumacolumna = 0;
            for(int i=0;i<cantidad;i++){
                sumacolumna+=matriz[j][i];
            }
            System.out.println("La suma de la columna "+j+" es: "+sumacolumna);
        }
    } 
}
