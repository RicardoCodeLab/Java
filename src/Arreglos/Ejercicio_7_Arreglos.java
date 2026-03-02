// Crear un programa que lea por el teclado 10 elementos 
// y desplace una posición hacia abajo: el primero pasa a ser segundo
// el segundo pasa a ser tercero y así sucesivamente.
// El último pasa a ser primero.
package Arreglos;
import java.util.Scanner;

public class Ejercicio_7_Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[]arreglo= new int[10]; // Declaramos arreglo
        for(int i=0;i<10;i++){
            System.out.println("Ingresar elemento");
            arreglo[i]=sc.nextInt();
        }
        
        // Sabemos cual es el ultimo elemento ingresado
        int ultimo = arreglo[9];
        
        // Desplazamiento circular
        for(int i=9; i>0;i--){
            arreglo[i]=arreglo[i-1];
        }
        
        //El ultimo como primero
        arreglo[0]=ultimo;
        
        //Mostramos los datos
        for(int Alonso:arreglo){
            System.out.println(Alonso);
        }
    }
}
