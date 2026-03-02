package Matrices;
import java.util.Scanner;
public class Matrices_Scanner {
    public static void main(String[] args) {
        int nfilas, ncolumnas;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar cantidad de filas");
        nfilas=sc.nextInt();
        System.out.println("Ingresar cantidad de columnas");
        ncolumnas=sc.nextInt();
        // INGRESAR ELEMENTOS A LA MATRIZ
        int[][] matriz = new int[nfilas][ncolumnas];
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncolumnas;j++){
                System.out.println("Ingresar elemento"+"["+i+"]"+"["+j+"]");
                matriz[i][j]=sc.nextInt();
            }
        }
        // IMPRIMIR LOS DATOS DE LA MATRIZ
        System.out.println("La matriz es la siguiente: ");
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncolumnas;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
