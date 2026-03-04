package POO;
import java.util.Scanner;
public class Main_Operacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        int num1=sc.nextInt();
        System.out.println("Ingresar el segundo numero");
        int num2=sc.nextInt();
        Operacion objeto1=new Operacion();
        objeto1.sumar(num1, num2);
        objeto1.restar(num1, num2);
        objeto1.multiplicar(num1, num2);
        objeto1.dividir(num1, num2);
        System.out.println("\nLos resultados son: ");
        objeto1.mostraresultados();
    }
}
