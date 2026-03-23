package Generics;

public class Main_Generics {
    public static void main(String[] args) {
        Caja <String> cajaStrings = new Caja<>(); // Creamos la caja de Strings
        cajaStrings.ponerAlgo("Hola Mundo"); // Agregamos contenido a la caja
        String contenido = cajaStrings.obtenerAlgo(); // El contenido lo asignamos en la variable contenido
        System.out.println("El contenido es: "+ contenido); // Imprimimos el contenido con la variable 

        Caja <Integer> cajaEnteros = new Caja<>(); // Creamos la caja de Enteros
        cajaEnteros.ponerAlgo(32); // Agregamos el valor a la caja
        int numero = cajaEnteros.obtenerAlgo(); // El contenido lo asignamos en la variable numero
        System.out.println("El contenido es: "+numero);
    }
}
