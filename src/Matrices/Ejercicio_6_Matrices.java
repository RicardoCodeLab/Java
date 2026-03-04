package Matrices;
import java.util.Scanner;
// Calcular la matriz transpuesta
public class Ejercicio_6_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][]=new int[2][3];
        for(int i=0;i<2;i++){ // recorremos filas
            for(int j=0;j<3;j++){  //recorremos columnas
                System.out.println("Ingresar elemento: "+"["+i+"]"+"["+j+"]");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        // MATRIZ TRANSPUESTA
        int transpuesta[][]=new int [3][2]; // Invertimos los tamaños
        for(int j=0;j<3;j++){ // recorremos filas
            for(int i=0;i<2;i++){ // recorremos columnas
                // Esta fila dice lo que antes estaba en la fila i y columna j, ahora ponlo en la fila j y columna i
                transpuesta[j][i]=matriz[i][j];
            }
        }
        System.out.println("Imprimimos la matriz principal");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Imprimimos la matriz transpuesta");
        for(int j=0;j<3;j++){
            for(int i=0;i<2;i++){
                System.out.print(transpuesta[j][i]);
            }
            System.out.println("");
        }
    }
}
