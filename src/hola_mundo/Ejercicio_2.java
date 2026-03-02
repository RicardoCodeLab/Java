package hola_mundo;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float nhoras, montoxhora;
       System.out.println("Ingresar el numero de horas trabajadas");
       nhoras = sc.nextFloat();
       System.out.println("ingresar el monto a pagar por hora trabajada");
       montoxhora=sc.nextFloat();
        System.out.println("El salario semanal del trabajador es: "+(nhoras*montoxhora)+" soles");
    }
    
}
