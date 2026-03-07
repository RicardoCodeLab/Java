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
public class Cuenta {
    public String titular;
    private double saldo;
    
    Cuenta(String nombre){
        this.titular=nombre;
        saldo=0;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double cantidad){
      if(cantidad>0){
          saldo+=cantidad;
      } 
    }
}
    
