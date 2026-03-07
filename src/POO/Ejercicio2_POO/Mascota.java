package Ejercicio2_POO;
public class Mascota {
    private String nombre;
    private int nivelEnergía;
    // CONSTRUCTOR
    public Mascota(String nombre){
        this.nombre=nombre;
        this.nivelEnergía=100;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNivelEnergía(int nuevaEnergia) {
        if(nuevaEnergia>=0 && nuevaEnergia<=100){
            this.nivelEnergía = nuevaEnergia;
        }else{
            System.out.println("Error nivel de energía incorrecto");
        }
    }
    
    // MÉTODO toString
    @Override
    public String toString() {
        return "La mascota " + nombre + ", tiene " + nivelEnergía + "% de bateria";
    }
}
