package Ejercicios_Bucles;
import java.util.Scanner;
// pedir numeros hasta ingresar negativo y mostrar cuantos
// numeros fueron ingresados
public class Ejercicio_4_Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numeros positivos");
        int num = sc.nextInt();
        int i=0;
        while(num>=0){
            System.out.println("Ingresar numeros positivos");
            num = sc.nextInt();
            i++;
        }
        System.out.println("La cantidad de numeros ingresados son: "+i);
        System.out.println('\n'+"Ingreso un numero negativo");
    }
    
}
