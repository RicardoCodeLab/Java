package hola_mundo;
import java.util.Scanner;
public class Hola_Mundo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
      int nota1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
      int nota2 = sc.nextInt();
        System.out.println("Ingresa el tercer numero");
      int nota3 = sc.nextInt();
      int suma = nota1 + nota2+ nota3;
      int prom = suma/3;
      System.out.println("El promedio de las notas es: "+prom);
      System.out.println("La suma de las notas es: "+suma);
    }
}
