package Interfaces;
public class MainPersonaje {
    public static void main(String[] args) {
        Guerrero Alonso = new Guerrero("Alonso");
        Alonso.atacar();
        Alonso.descansar();
        System.out.println("");
        Mago Ricardo = new Mago("Ricardo");
        Ricardo.lanzarHechizo();
        Ricardo.atacar();
        Ricardo.descansar();
    }
    
}
