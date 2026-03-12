package Ejercicio6_POO;
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private int peso;
    private double altura;
    
    // CONSTRUCTOR CON TODOS LOS PARÁMETROS
    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.comprobarmayoredad();
        this.generardni();
        this.sexo=sexo;
        this.comprobarsexo();
        this.peso = peso;
        this.altura = altura;
        this.calcularimc();
    }
    
    // CONSTRUCTOR CON ALGUNOS PARÁMETROS
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.comprobarmayoredad();
        this.generardni();
        this.sexo=sexo;
        this.comprobarsexo();
    }
    
    // CONSTRUCTOR CON PARÁMETROS POR DEFECTO
    public Persona(){
        this.generardni();
        this.sexo = 'M';
    }
    
    // MÉTODO GENERAR DNI
    public void generardni(){
        int id=(int)(Math.random()*100000000);
        this.dni=id;
    }
    // MÉTODO COMPROBAR SI EL SEXO ES CORRECTO
    public void comprobarsexo(){
        if(sexo== 'H'||sexo=='F'){
            System.out.println("El sexo ingresado es correcto");
        }else{
            System.out.println("!Hubo un error al ingresar tipo de sexo");
        }
    }
    // MÉTODO PARA CALCULAR EL IMC
    public void calcularimc(){
        int valor=(int)(peso/(altura*2));
        if(valor>=30){
            System.out.println("El cliente tiene Obesidad\n");
        }else if(valor>=25){
            System.out.println("El cliente tiene Sobrepeso\n");
        }else if(valor>=18){
            System.out.println("El cliente tiene Peso Saludable\n");
        }else{
            System.out.println("El cliente tiene Bajo Peso\n");
        }
    }
    // MÉTODO COMPROBAR SI ES MAYOR DE EDAD
    public void comprobarmayoredad(){
        if(edad>=18){
            System.out.println("-------------------------------\n"+"La persona es mayor de edad");
        }else{
            System.out.println("-------------------------------\n"+"La persona es menor de edad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        if(sexo=='H'|| sexo=='F'){
        return nombre + " // Edad=" + edad + " // DNI: " + dni + " // Sexo=" + sexo + ",\nPeso: " + peso +" kilogramos"+ ",\nAltura: " + altura+" metros\n";  
        }else{
        return nombre + ", Edad=" + edad + ", DNI: " + dni + ",\npeso=" + peso + ",\nAltura=" + altura+" metros\n";      
        }
    }
    
    
    
    
}
