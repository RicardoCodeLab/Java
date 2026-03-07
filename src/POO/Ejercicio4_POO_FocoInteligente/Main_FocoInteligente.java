package Ejercicio4_POO_FocoInteligente;
public class Main_FocoInteligente {
    public static void main(String[] args) {
        // OBJETO 1
        Foco Foco1 = new Foco("Bticino");
        Foco1.interruptor();
        System.out.println(Foco1);
        
        // OBJETO 2
        Foco Foco2 = new Foco("3M");
        Foco2.interruptor();
        System.out.println(Foco2);
    }
    
}
