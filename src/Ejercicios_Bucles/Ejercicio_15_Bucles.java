package Ejercicios_Bucles;
import java.util.Scanner;
// Pedir 10 sueldos, Mostrar la suma y cúantos mayores de 1000 soles
public class Ejercicio_15_Bucles {
    public static void main(String[] args) {
       int num,suma=0, mayores=0;
       Scanner sc=new Scanner(System.in);
       for (int i=1;i<=10;i++){
           System.out.println("Ingresar sueldo");
           num = sc.nextInt();
           if (num>1000){
               mayores++;
           }
           suma+=num;
       }
        System.out.println("Hay "+mayores+" sueldos mayor a 1000 soles");
        System.out.println("La suma total de sueldos es: "+suma);
    }
    
}
