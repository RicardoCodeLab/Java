// Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad
// El titular será obligatorio y la cantidad es opcional, tendrá dos métodos.
// ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
// retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

package Ejercicio1_POO;
public class Main_Cuenta {
    public static void main(String[] args) {
        Cuenta titular1= new Cuenta("Ricardo Alonso Temoche Soriano", 1500);
        titular1.ingresar(500);
        titular1.retirar(200);
        System.out.println("El titular 1 "+titular1.titular+" tiene en su cuenta: "+titular1.cantidad+" soles");
        Cuenta titular2= new Cuenta("Adriana Soriano Veliz");
        titular2.ingresar(5000);
        titular2.retirar(300);
        System.out.println("El titular 2 "+titular2.titular+" tiene en su cuenta: "+titular2.cantidad+" soles");
    }
}
