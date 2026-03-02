package hola_mundo;
import java.util.Scanner;

public class Estructura_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int numero = sc.nextInt();
        
        switch(numero){
            case 1: System.out.println("1");break;
            case 2: System.out.println("2");break;
            default: System.out.println("El numero es diferente a 1 y 2");
        }
    }
}
