package hola_mundo;
import java.util.Scanner;

public class Operador_Ternario {
    public static void main(String[] args) {
        int num;
        System.out.println("Ingresar un numero");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String valor = (num>=20) ? "El numero es mayor igual a 20" : "El numero es menor a 20";
        System.out.println(valor);
    }    
}
