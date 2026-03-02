package Ordenamientos;
import java.util.Scanner;
public class Método_Busqueda_Secuencial_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar la cantidad de elementos del arreglo");
        int cantidad = sc.nextInt();
        int[]arreglo= new int[cantidad];
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingresar Elemento");
            arreglo[i]=sc.nextInt();
        }
        System.out.println("Ingresar el dato a buscar");
        int dato=sc.nextInt();
        
        // BUSQUEDA SECUENCIAL
        int i=0;
        boolean encontrado=false;
        while((i<cantidad)&&(!encontrado)){
            if(arreglo[i]==dato){
                encontrado=true;
            }
            i++;
        }
        if(encontrado==true){
            System.out.println("El dato fue encontrado en la posicion: "+(i-1));
        }else{
            System.out.println("No se encontro el dato en el arreglo");
        }
    }
}
