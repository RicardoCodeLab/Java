// Leer por teclado un arreglo de 10 elementos numéricos enteros
// y una posición entre [0 y 9]. Eliminar el elemento situado en la
// posición sin dejar huecos.
package Arreglos;
import java.util.Scanner;
public class Ejercicio_8_Arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner
        // Declaramos arreglo
        String []arreglo1 = new String[10];
        // Completamos elementos en el arreglo
        for(int i=0;i<arreglo1.length;i++){
            System.out.println("Ingresar elementos");
            arreglo1[i]=sc.nextLine();
        }
        // Elegimos elemento a eliminar
        System.out.println("Ingresar posición a eliminar: 0 - 9");
        int valor = sc.nextInt();
        arreglo1[valor]=null;
        
        for(int i=0;i<arreglo1.length;i++){
            System.out.println(arreglo1[i]);
        }
    }
}
