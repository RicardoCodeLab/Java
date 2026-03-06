package POO;
public class User {
    double id= Math.random();
    String name;
    
    User(String name){
        this.name=name;
    }
    
    public void saludar(){
        System.out.println("Hola, Mi nombre es: "+name+", y me asiganron el id: "+id);
    }
}
