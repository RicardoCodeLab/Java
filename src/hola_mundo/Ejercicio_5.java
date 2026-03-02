package hola_mundo;
import java.util.Scanner;
/*
Jose tiene N dolares, luis tiene la mitad de José.
Tony tiene la mitad de lo que tiene Jose + Luis
Calcular el dinero de cada uno
*/
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar dinero de Jose");
        int jose = sc.nextInt();
        int luis = jose/2;
        int Tony = (jose+luis)/2;
        System.out.println("El dinero de Jose es: "+jose);
        System.out.println("El dinero de Luis es: "+luis);
        System.out.println("El dinero de Tony es: "+Tony);
    }
    
}
