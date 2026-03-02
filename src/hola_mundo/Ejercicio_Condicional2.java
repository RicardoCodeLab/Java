package hola_mundo;
import java.util.Scanner;

public class Ejercicio_Condicional2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Ingresar el segundo numero");
        int n2 = sc.nextInt();
        if (n1==n2){
            System.out.println("numeros iguales");
        } else if (n1>n2){
            System.out.println("El numero mayor es: "+n1 );
        } else{
            System.out.println("El numero mayor es: "+n2);
        }
    }
}
