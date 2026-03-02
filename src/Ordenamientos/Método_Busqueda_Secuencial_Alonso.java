package Ordenamientos;
public class Método_Busqueda_Secuencial_Alonso {
    public static void main(String[] args) {
        int[]arreglo={12,15,23,22,30,89,25};
        int dato=25;
        boolean encontrado=false;
        int i=0;
        // BUSQUEDA SECUENCIAL
        while((i<7)&&(!encontrado)){
            if(arreglo[i]==dato){
                encontrado=true;
            }
            i++;
        }
        if(encontrado==true){
            System.out.println("El dato fue encontrado en la posicion: "+(i-1));
        }else{
            System.out.println("No se encontró el dato en el arreglo");
        }
    }
    
}
