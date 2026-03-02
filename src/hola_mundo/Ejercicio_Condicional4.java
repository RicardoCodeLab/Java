package hola_mundo;
import javax.swing.JOptionPane;

public class Ejercicio_Condicional4 {
    public static void main(String[] args) {
        int compra = Integer.parseInt(JOptionPane.showInputDialog("Ingresar monto de la compra: "));
        if (compra >=300){
           double desc = compra*0.2; 
           JOptionPane.showMessageDialog(null,"El monto a pagar es "+(compra-desc));
        }else{
           JOptionPane.showMessageDialog(null, "El monto a pagar es: "+ compra);
        }
    } 
}
