package hola_mundo;
import java.util.Scanner;

public class Ejercicio_Condicional7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar los 3 digitos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>num2 && num2>num3){
            System.out.println("El orden es "+num1+" "+num2+" "+num3);
        }else if(num1>num3 && num3>num2){
            System.out.println("El orden es "+num1+" "+num3+" "+num2);
        }else if(num3>num2 && num1>num2){
            System.out.println("El orden es "+num3+" "+num1+" "+num2);
        }else if(num3>num2 && num2>num1){
            System.out.println("El orden es "+num3+" "+num2+" "+num1);
        }else if(num2>num1 && num1>num3){
            System.out.println("El orden es "+num2+" "+num1+" "+num3);
        }else{
            System.out.println("El orden es "+num2+" "+num3+" "+num1);
        }
    }
}
