package Ejercicio_5_POO;
public class MainEjercicio5 {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Ricardo Alonso Temoche Soriano");
        cuenta1.setCantidad(5500);
        cuenta1.depositar(500);
        cuenta1.retirar(6800);
        System.out.println(cuenta1+"\n"+"\n");
        
        Cuenta cuenta2= new Cuenta("Veronica Isabel Vera Pacherre");
        cuenta2.setCantidad(8000);
        cuenta2.depositar(214.2615);
        cuenta2.retirar(158.1215);
        cuenta2.retirar(9000);
        System.out.println(cuenta2);
    }    
}
