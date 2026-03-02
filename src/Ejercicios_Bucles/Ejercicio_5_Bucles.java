package Ejercicios_Bucles;
// Juego para adivinar el número
import java.util.Scanner;
public class Ejercicio_5_Bucles {
    public static void main(String[] args) {
        int i=0; //intentos
        int adv = (int)(Math.random()*100)+1; // generamos el numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa numero por adivinar");
        int num = sc.nextInt();
        while(adv!=num){
            i++;
            if(num>adv){
                System.out.println("es mayor");
            } else {
                System.out.println("es menor");
            }
            System.out.println("\n"+"Ingresa numero por adivinar");
            num = sc.nextInt();
        }
        System.out.println("\n"+"Adivinaste en "+i +" intentos");
    }
}
