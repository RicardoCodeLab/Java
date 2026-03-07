/* Ejercicio 3: La Cuenta Bancaria (Encapsulamiento)
Aquí vamos a ver por qué los Getters, Setters y los Modificadores de Acceso son vitales.
El reto:
Crea una clase Cuenta.
Atributos: titular (público) y saldo (privado).
Constructor: Recibe el nombre del titular y un saldo inicial.
Getter: Crea un método para ver el saldo, pero no un Setter directo(debido a que se cambia depositando).
Método depositar(double cantidad): Este método debe sumar dinero al saldo solo si la cantidad es mayor a 0.

*/
package Ejercicio3_POO_CuentaBancaria;
public class Main_CuentaBancaria {
    public static void main(String[] args) {
        Cuenta titular1 = new Cuenta("Alonso");
        titular1.depositar(5000);
        System.out.println("El titular 1 es: "+titular1.titular+" tiene un saldo de: "+titular1.getSaldo());
    }
    
}
