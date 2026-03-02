package hola_mundo;
import java.util.Scanner;

public class Ejercicio_Condicional6 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el primer digito");
        int n1 = sc.nextInt();
        System.out.println("Ingresar el segundo digito");
        int n2 = sc.nextInt();
        if (n1%2==0 && n2%2==0){
            System.out.println("Ambos numeros son pares");
        } else if (n1%2==0 && n2%2!=0) {
            System.out.println("El numero par es "+n1+", pero el numero "+n2+" es impar");
        } else if(n1%2!=0 && n2%2==0){
            System.out.println("El numero impar es "+n1+", pero el numero "+n2+" es par");
        } else{
            System.out.println("Ambos son impares");
        }
    }
}
