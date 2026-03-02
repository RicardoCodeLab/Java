package Ejercicios_Bucles;
// Diseñar un programa que te brinde el producto
// de los 5 primeros numeros impares
public class Ejercicio_12_Bucles {
    public static void main(String[] args) {
        int acum =1;
        for(int i=1;i<=10;i+=2){
            acum*=i;
        }
        System.out.println("El producto es: "+acum);
    }
}
