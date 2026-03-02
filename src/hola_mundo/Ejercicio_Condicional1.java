package hola_mundo;
import java.util.Scanner;

public class Ejercicio_Condicional1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero para evaluar si es multiplo de 10");
        int num = sc.nextInt();
        String valor = (num%10==0)? "El numero es multiplo de 10":"El numero no es multiplo de 10";
        System.out.println(valor);
    }
}
