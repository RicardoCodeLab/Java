package POO;
public class Operacion {
    // ATRIBUTOS
    int num1, num2, sumar, restar, multiplicar, dividir;
    
    // MÉTODOS
        // Método para sumar 
        public void sumar(int num1, int num2){ // 2 PARÁMETROS
            sumar=num1+num2;
        }
        // Método para restar 
        public void restar(int num1, int num2){
            restar=num1-num2;
        }
        // Método para multiplicar
        public void multiplicar(int num1, int num2){
           multiplicar=num1*num2;
        }
        // Método para dividir
        public void dividir(int num1, int num2){
            dividir=num1/num2;
        }
        // Método mostraresultado
        public void mostraresultados(){
            System.out.println("La suma es: "+sumar);
            System.out.println("La resta es: "+restar);
            System.out.println("La multiplicacion es: "+multiplicar);
            System.out.println("La division es: "+dividir);
        }
}
