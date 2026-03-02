package Matrices;
// Una matríz es simétrica cuando tiene misma cantidad de filas y columnas
// Además que la matriz transpuesta sea igual a la matriz original
import java.util.Scanner;

public class Matriz_Simétrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]matriz;
        System.out.println("Indicar la cantidad de filas y columnas");
        int n=sc.nextInt();
        matriz = new int[n][n];
        
        // LLENAMOS MATRIZ
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Ingresar elemento:"+"["+i+"]"+"["+j+"]");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        // EVALUA SI ES SIMÉTRICA O NO
        boolean simetrica=true; // matriz simetrica hasta que se compruebe lo contrario
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(matriz[i][j]!=matriz[j][i]){
                   simetrica=false;
                }
            }
        }
        // IMPRIME SI ES SIMETRICA O NO
        if(simetrica==true){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz es Asimetrica");
        }
        
        // IMPRIMIR LA MATRIZ
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
