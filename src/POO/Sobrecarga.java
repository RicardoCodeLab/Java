package POO;
public class Sobrecarga {
    // 1. Sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // 2. Sobrecarga: Sumar tres enteros (cambia el número de parámetros)
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Sobrecarga: Sumar decimales (cambia el tipo de parámetro)
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sobrecarga calc = new Sobrecarga();

        System.out.println(calc.sumar(5, 10));       // Llama al método 1
        System.out.println(calc.sumar(5, 10, 15));   // Llama al método 2
        System.out.println(calc.sumar(2.5, 3.7));    // Llama al método 3 
    }
}
