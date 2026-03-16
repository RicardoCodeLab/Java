package LinkedList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List <Persona> lista = new LinkedList<Persona>();
        // AGREGANDO OBJETOS AL FINAL DE LA LINKEDLIST
        lista.add(new Persona(658412168,"Neymar da Silva Santos Junior",34));
        lista.add(new Persona(658412168,"Lionel Andres Messi Cuccitini",38));
        lista.add(new Persona(658412168,"Cristiano Ronaldo dos Santos Aveiro",41));
        lista.add(new Persona(987165415,"Eden Michael Walter Lucien Hazard",35));
        // AGREGANDO OBJETOS AL INICIO DE LA LINKEDLIST
        lista.add(0,new Persona(758695423,"Philippe Coutinho Correia",33));
        lista.add(0,new Persona(758695423,"Pedro Gonzalez Lopez",23));
        
        // MOSTRAMOS LOS DATOS CON FOR 
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("\n");
        // MOSTRAMOS LOS DATOS CON FOR EACH
        for(Persona jugadores:lista){
            System.out.println(jugadores);
        }
    }  
}
