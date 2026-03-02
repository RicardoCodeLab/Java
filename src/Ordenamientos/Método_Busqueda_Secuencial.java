package Ordenamientos;
public class Método_Busqueda_Secuencial {
    public static void main(String[] args) {
        int[] arreglo = {1,5,9,6};
        int dato=9;
        boolean encontrado= false;
        
        // BUSQUEDA SECUENCIAL - LINEAL
        int i=0;// Índice para recorrer el arreglo (empezamos en la posición 0)
         
        // Recorrer todo el bucle y mientras NO hayamos encontrado el dato (!encontrado)
        while((i<4)&&(!encontrado)){
            if(arreglo[i]==dato){// ¿El número actual es igual al que busco?
                encontrado=true;// ¡Sí! Cambiamos la bandera a verdadero
            }
            i++;
        }
        // Si 'encontrado' es true, imprimimos la posición.
        // Se usa (i-1) porque el i++ del bucle se ejecuta una última vez 
        // justo después de encontrar el dato.
        if(encontrado==true){
            System.out.println("El dato fue encontrado en la posicion: "+(i-1));
        }else{
            System.out.println("El dato no fue encontrado en el arreglo");
        }
    }
}




