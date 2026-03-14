package Interfaces;
abstract class Personaje {
    protected String nombre;
    protected int puntosVida;

    public Personaje(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    // Método con código: Todos los personajes descansan igual
    public void descansar() {
        System.out.println(nombre + " esta descansando para recuperar fuerzas.");
    }

    // Método abstracto: Cada personaje ataca de forma diferente
    public abstract void atacar();
}

// 2. INTERFAZ: Una habilidad especial que no todos tienen
interface Hechicero {
    void lanzarHechizo(); // Contrato: "Si eres hechicero, debes saber lanzar hechizos"
}

// 3. CLASE CONCRETA: El Guerrero (Solo es Personaje)
class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, 200); // Los guerreros tienen mucha vida
    }

    @Override
    public void atacar() {
        System.out.println("El Guerrero "+nombre + " ataca con su espada pesada. Impacto fisico!");
    }
}

// 4. CLASE CONCRETA: El Mago (Es Personaje Y es Hechicero)
class Mago extends Personaje implements Hechicero {
    public Mago(String nombre) {
        super(nombre, 100); // Los magos tienen poca vida
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " golpea debilmente con su baston.");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("El Mago "+nombre + " lanza una BOLA DE FUEGO!");
    }
}
