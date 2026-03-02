package hola_mundo;
import java.util.Scanner;

public class Ejercicio_Condicional5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pago, hextra;
        System.out.println("Ingresar la cantidad de horas trabajadas");
        int horas = sc.nextInt();
        if (horas<40){
            pago = horas*23;
            System.out.println("El monto a pagar es de: "+ pago);
        } else if (horas>=40){
            hextra=horas-40;
            pago = (40*23)+(hextra*33);
            System.out.println("El monto a pagar es de: "+ pago);
        }            
    }
}
