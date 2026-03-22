package Relaciones;
import java.util.ArrayList;
import java.util.List;

public class relaciones {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setId(123456789);
        auto1.setMarca("Mazda");
        auto1.setModelo("RTX-30");
        List <Propietario> listapropietarios1 = new ArrayList <Propietario>();
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();
        
        prop1.setId(76124578);
        prop1.setNombre("Ricardo");
        prop1.setApellido("Soriano");

        prop2.setId(41438975);
        prop2.setNombre("Adriana");
        prop2.setApellido("Soriano");

        listapropietarios1.add(prop1);
        listapropietarios1.add(prop2);

        auto1.setListaPropietarios(listapropietarios1);

        System.out.println(auto1.toString());
    }
}
