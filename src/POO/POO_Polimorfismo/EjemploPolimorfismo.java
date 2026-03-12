package POO_Polimorfismo;
// 1. Superclase (Clase Base)
class Animal {
    // Método que será sobrescrito
    void hacerSonido() {
        System.out.println("El animal hace un sonido generico.");
    }
}

// 2. Subclases que heredan de Animal
class Perro extends Animal {
    // Sobrescribimos el método de la superclase
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: Guau");
    }
}

class Gato extends Animal {
    // Sobrescribimos el método de la superclase
    @Override
    void hacerSonido() {
        System.out.println("El gato maulla: Miau");
    }
}

// 3. Clase Principal para probar el polimorfismo
public class EjemploPolimorfismo {
    public static void main(String[] args) {
        // Creamos referencias de tipo Animal, pero que apuntan a objetos específicos
        Animal miAnimal1 = new Perro(); // Upcasting: Perro es tratado como Animal
        Animal miAnimal2 = new Gato();  // Upcasting: Gato es tratado como Animal

        // ¡Aquí ocurre la magia del polimorfismo!
        // Llamamos al mismo método genérico 'hacerSonido' en las referencias de tipo Animal
        miAnimal1.hacerSonido(); // Imprime: ¡Guau! (Java sabe que es un Perro)
        miAnimal2.hacerSonido(); // Imprime: ¡Miau! (Java sabe que es un Gato)

        System.out.println("---------------------------------");

        // Otro ejemplo usando un arreglo:
        Animal[] misAnimales = new Animal[3];
        misAnimales[0] = new Perro();
        misAnimales[1] = new Gato();
        misAnimales[2] = new Animal(); // También podemos usar la clase base

        System.out.println("Recorriendo el arreglo polimorficamente:");
        for (Animal animal : misAnimales) {
            // El ciclo trata a todos como Animal, pero cada uno hace su sonido específico
            animal.hacerSonido();
        }
    }
}