package Ejercicios_Bucles;
// Pedir 10 numeros y mostrar la media de los números positivos
// la media de los numeros negativos y la cantidad de ceros.
import java.util.Scanner;

public class Ejercicio_14_Bucles {
    public static void main(String[] args) {
        int acump=0,acumn=0;int positivos=0, negativos=0, ceros=0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("Ingresar numero");
            int num = sc.nextInt();
            if(num>0){
               acump+=num; 
               positivos++;
            }else if(num<0){
               acumn+=num;
               negativos++;
            }else{
                ceros+=1;
            }
        }
        // Condicional para positivos
        if(acump==0){
            System.out.println("No hay números positivos");
        }else{
            System.out.println("El promedio de positivos es :"+(acump/positivos));
        }
        // Condicional para negativos
        if(acumn==0){
            System.out.println("No hay numeros negativos");
        }else{
            System.out.println("El promedio de negativos es :"+(acumn/negativos));
        }
        // Condicional para ceros
        if(ceros==0){
            System.out.println("No hay numeros 0");
        }else{
            System.out.println("La cantidad de ceros es :"+ceros);
        }
    }
    
}
