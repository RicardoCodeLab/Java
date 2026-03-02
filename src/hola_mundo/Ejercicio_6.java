package hola_mundo;
import java.util.Scanner;
// Calculadora del Promedio Ponderado 10% para participación
// 25% de PC1 y PC2 
// 40% para Ecaluación Final
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float part, pc1, pc2, ex, semisuma, promediop, suma;
        System.out.println("Ingresar la nota de participación");
        part = sc.nextFloat();
        System.out.println("Ingresar la nota de la PC1");
        pc1 = sc.nextFloat();
        System.out.println("Ingresar la nota de la PC2");
        pc2 = sc.nextFloat();
        System.out.println("Ingresar la nota del examen final");
        ex = sc.nextFloat();
        semisuma = (part*10)+(pc1*25)+(pc2*25)+(ex*40);
        suma = (part+pc1+pc2+ex);
        promediop = semisuma/100;
        System.out.println("El promedio ponderado es "+promediop);
    }  
}
