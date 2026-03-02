package hola_mundo;
import java.util.Scanner;
// ingresar 2 dígitos y te brinde el cuadrado de la suma

public class Ejercicio_7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el primer digito");
        float d1 = sc.nextFloat();
        System.out.println("ingresar el segundo digito");
        float d2 = sc.nextFloat();
        double cuadrado = Math.pow(d1, 2)+Math.pow(d2, 2)+(2*d1*d2);
        System.out.println("El cuadrado de la suma es: "+cuadrado);
    }
}
