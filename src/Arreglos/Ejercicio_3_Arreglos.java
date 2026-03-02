package Arreglos;
//Leer 5 numeros almacenar en arreglo, brindr media de positivos
// media de negativos y cantidad de ceros
import java.util.Scanner;

public class Ejercicio_3_Arreglos {
    public static void main(String[] args) {
        int ceros=0, negativos=0, positivos=0, acumn=0, acump=0;
        Scanner sc = new Scanner(System.in);
        int[]promedio= new int[5];
        for(int i=0;i<promedio.length;i++){
            System.out.println("Ingresar elementos");
            promedio[i]=sc.nextInt();
            if(promedio[i]<0){
                acumn+=promedio[i];
                negativos++;
            } else if(promedio[i]>0){
                acump+=promedio[i];
                positivos++;
            }else{
                ceros++;
            }
        }
        // Positivos
        if(acump==0){
            System.out.println("No hay positivos");
        }else{
            System.out.println(acump/positivos);
        }
        // Negativos
        if(acumn==0){
            System.out.println("No hay negativos");
        }else{
            System.out.println(acumn/negativos);
        }
        // ceros
        if(ceros==0){
            System.out.println("No hay ceros");
        }else{
            System.out.println("El numero de ceros es "+ceros);
        }
    }
    
}
