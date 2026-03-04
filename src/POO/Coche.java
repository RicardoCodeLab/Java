package POO;
public class Coche {
    // ATRIBUTOS
    String color;
    String marca;
    int vel;
    
    // MÉTODO
    public static void main(String [] args){
            Coche coche1=new Coche(); // Instanciamos Objeto coche1
            coche1.color="Rojo";
            coche1.marca="Mustang";
            coche1.vel=60;
            Coche coche2=new Coche(); // Instanciamos Objeto coche2
            coche2.color="Azul";
            coche2.marca="Chevrolet";
            coche2.vel=45;
            Coche coche3=new Coche(); // Instanciamos Objeto coche2
            coche3.color="Amarillo";
            coche3.marca="Audi";
            coche3.vel=30;
            System.out.println("Imprimimos los valores del coche1");
            System.out.println("El color del coche1 es: "+coche1.color);
            System.out.println("La marca del coche1 es: "+coche1.marca);
            System.out.println("La velocidad del coche1 es: "+coche1.vel+" kilometros");
            System.out.println("\nImprimimos los valores del coche2");
            System.out.println("El color del coche2 es: "+coche2.color);
            System.out.println("La marca del coche2 es: "+coche2.marca);
            System.out.println("El velocidad del coche2 es: "+coche2.vel+" kilometros");
            System.out.println("\nImprimimos los valores del coche3");
            System.out.println("El color del coche3 es: "+coche3.color);
            System.out.println("La marca del coche3 es: "+coche3.marca);
            System.out.println("El velocidad del coche3 es: "+coche3.vel+" kilometros");
    }
}
