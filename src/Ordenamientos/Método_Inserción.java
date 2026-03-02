package Ordenamientos;
import java.util.Scanner;
public class Método_Inserción {
    public static void main(String[] args) {
        int aux, pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos");
        int cantidad= sc.nextInt();
        int[] arreglo=new int [cantidad];
         
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingresar elemento");
            arreglo[i]=sc.nextInt();
        }
        
        // ORDENAMIENTO INSERCIÓN
        for(int i=0;i<cantidad;i++){
            aux=arreglo[i];
            pos=i;
            
            while((pos>0)&&(arreglo[pos-1]>aux)){
                //intercambio
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            //pos=0
            arreglo[pos]=aux;
            }
            //Mostrar resultado
            System.out.println("El resultado del ordenamiento Insercion");
            for(int i=0;i<cantidad;i++){
                System.out.println(arreglo[i]);
            }
    }
}
