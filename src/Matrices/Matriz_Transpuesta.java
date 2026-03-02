package Matrices;
import java.util.Scanner;
public class Matriz_Transpuesta {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar cantidad de filas");
        int filas=sc.nextInt();
        System.out.println("Ingresar cantidad de columnas");
        int columnas=sc.nextInt();
        // Inicializamos la matriz inicial
        int matriz[][]=new int[filas][columnas];
        // Inicializamos la matriz transpuesta
        int transpuesta[][]=new int[columnas][filas];
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Ingresar elemento: "+"["+i+"]"+"["+j+"]");
                matriz[i][j]=sc.nextInt();
            }
        }
        //IMPRIMIMOS LA MATRIZ INICIAL
        System.out.println("La matriz inicial es: ");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        // MATRIZ TRANSPUESTA
        for(int j=0;j<columnas;j++){
            for(int i=0;i<filas;i++){
                transpuesta[j][i]=matriz[i][j];
            }
        }
        // IMPRIMIMOS LA MATRIZ TRANSPUESTA
        System.out.println("La matriz transpuesta es: ");
        for(int j=0;j<columnas;j++){
            for(int i=0;i<filas;i++){
                System.out.print(transpuesta[j][i]);
            }
            System.out.println("");
        }
    }
    
}
