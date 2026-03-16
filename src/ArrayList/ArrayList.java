package ArrayList;
import java.util.List;
import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        // CREAMOS EL ARRAYLIST "lista"
        List<Persona> lista = new ArrayList<>();
        // AGREGAMOS ELEMENTOS AL ARRAYLIST
        lista.add(new Persona(76124578,"Ricardo Alonso Temoche Soriano",23));
        lista.add(new Persona(41438975,"Lady Adriana Soriano Veliz",43));
        lista.add(new Persona(75145202,"Kiara Melissa Temoche Soriano",15));
        lista.add(new Persona(45684122,"Veronica Isabel Vera Pacherre",30));
        
        // MOSTRAMOS LOS DATOS CON FOR 
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).toString());
        }
        System.out.println("\n");
        // MOSTRAMOS LOS DATOS CON FOR EACH
        for(Persona admitidos:lista){
            System.out.println(admitidos.toString());
        }
    }
}
