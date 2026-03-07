package Ejercicio2_POO;
public class Main_Mascota {
    public static void main(String[] args) {
        Mascota Negra = new Mascota("Negra");
        System.out.println(Negra);
        
        Mascota Cielo = new Mascota("Cielo");
        System.out.println(Cielo);
        
        Mascota Mechas = new Mascota("Mechas");
        System.out.println(Mechas);
        
        Mascota Chloe = new Mascota("Chloe");
        Chloe.setNivelEnergía(20);
        System.out.println(Chloe);
    }
}
