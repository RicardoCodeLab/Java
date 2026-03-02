package hola_mundo;
import java.util.Scanner;

public class Ejercicio_Condicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar caracter");
        char letra = sc.nextLine().charAt(0);
        if(Character.isUpperCase(letra)){
            System.out.println("El caracter ingresado esta en mayuscula");
        } else{
            System.out.println("El caracter ingresado esta en minuscula");
        }
    }
}
