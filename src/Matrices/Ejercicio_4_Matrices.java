package Matrices;
// Crear matriz y rellenar los datos de la diagonal principal con 1
// y el resto con 0.
import java.util.Scanner;

public class Ejercicio_4_Matrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar la cantidad de filas y columnas");
        int cantidad=sc.nextInt();
        int matriz[][]=new int[cantidad][cantidad];
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                if(i==j){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        //IMPRIMIMOS LA MATRIZ
        System.out.println("LA MATRIZ ES LA SIGUIENTE: ");
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                System.out.print(matriz[i][j]);    
            }
            System.out.println("");
        }
    }
}
