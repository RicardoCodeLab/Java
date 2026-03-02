package hola_mundo;
import java.util.Scanner;

public class Ejercicio_3 {
 /* Construir un programa que dado el número de horas te brinde
    la cantidad de semanas, días y horas equivalentes. */  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresar cantidad de horas: ");
    int nhoras = sc.nextInt();
    int semanas = nhoras/168;
    int resto1 = nhoras % 168;
    int dias = resto1/24;
    int horas = resto1%24;
    System.out.println("La cantidad de semanas son: "+semanas);
    System.out.println("La cantidad de dias son: "+ dias);
    System.out.println("La cantidad de horas son: "+horas);
 }
}
