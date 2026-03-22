package Excepciones;
public class Excepciones{
    public static void main(String [] args){

        // EXCEPCIÓN DEBIDO A QUE NO SE PUEDE DIVIDIR ENTRE 0
        try{
            int resultado = 3/0;
        } catch (Exception e) {
            System.out.println("Excepción no se puede dividir entre 0");
        }

        // EXCEPCIÓN DESBORDAMIENTO DE ARREGLO
        int [] edades = {18,19,20,21,22,23};
        try {
            System.out.println(edades[6]);
        } catch (Exception e) {
            System.out.println("Error de desbordamiento de arreglo");
        }
    }
}