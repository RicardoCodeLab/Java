package Ejercicio4_POO_FocoInteligente;
public class Foco {
    public String marca;
    private boolean encendido;
    
    // CONSTRUCTOR 
    public Foco(String marca){
        this.marca=marca;
        encendido=false;
    }
    // MÉTODO INTERRUPTOR
    public void interruptor(){
        this.encendido= !this.encendido;
    }
    
    // MÉTODO toString
    @Override
    public String toString() {
        if(encendido==true){
            return "El foco marca "+ marca + ",esta encendido";
        }else{
            return "El foco marca"+ marca + ",esta apagado";
        }
    }
}
