package hola_mundo;
import java.util.Scanner;

public class Estructura_IF {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        float numero = sc.nextFloat();
        
        if(numero==10){
            System.out.println("El número el 10");
        }else{
            System.out.println("El número es diferente de 10");
        }
    }   
}
