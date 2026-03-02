package Ordenamientos;

import java.util.Scanner;

public class Método_Burbuja_Scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos");
        int cantidad = sc.nextInt();
        int[]arreglo=new int[cantidad];
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingresa elemento de arreglo");
            arreglo[i]=sc.nextInt();
        }
        
        
    }
}
