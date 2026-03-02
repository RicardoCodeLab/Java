package Arreglos;
public class Bucle_For_Each {
    public static void main(String[] args) {
        // Declaramos arreglo y usamos for
        int[] numeros = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
        // Declaramos arreglo y usamos each
        int[] edades ={18,19,20,21,22,23};
        for (int Alonso:edades){ // Apodamos arreglo a Alonso
            System.out.println(Alonso);
        }
    }
}
