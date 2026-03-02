package hola_mundo;
import java.util.Scanner;

public class Ejercicio_Condicional8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar número");
        int num = sc.nextInt();
        if (num<10){
            System.out.println("Tiene 1 dígito");
        }else if(num<100){
            System.out.println("Tiene 2 digitos");
        }else if(num<1000){
            System.out.println("Tiene 3 digitos");
        }else if(num<10000){
            System.out.println("Tiene 4 digitos");
        }else if(num<100000){
            System.out.println("Tiene 5 digitos");
        }else{
            System.out.println("Tiene 6 digitos");
        }
    }
    
}
