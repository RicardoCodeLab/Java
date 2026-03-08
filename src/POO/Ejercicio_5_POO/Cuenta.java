package Ejercicio_5_POO;
public class Cuenta {
    private String titular;
    private double cantidad;
    
    Cuenta(String nombre){
        this.titular=nombre;
        cantidad=0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void depositar(double deposito){
        cantidad+=deposito;
        cantidad = Math.round(cantidad * 100.0) / 100.0; // limitar decimales a 2 cifras
    }
    
    public void retirar(double retiro){
        if(retiro>cantidad){
            System.out.println("!SALDO INSUFICIENTE - FALLO OPERACION RETIRO\n");
        }else{
            cantidad-=retiro;
            cantidad = Math.round(cantidad * 100.0) / 100.0; // limitar decimales a 2 cifras
        }
    }

    @Override
    public String toString() {
        return "El titular es: "+titular+",\nSaldo: S/." + cantidad+" soles";
    } 
}



