package Pilas;
import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack <Integer> pila = new Stack<Integer>();
        
        // MÉTODO PARA IMPRIMIR ELEMENTOS
        System.out.println("Pila Vacia: "+pila);
        // MÉTODO PARA SABER SI ESTA VACÍA BOOLEAN
        System.out.println("Pila Vacia? "+pila.isEmpty());
        
        // MÉTODO PARA AGREGAR ELEMENTOS
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        // RECORRER PILA
        for(Integer pilas:pila){
            System.out.println(pilas);
        }
        
        // MOSTRAR LA CANTIDAD DE ELEMENTOS Y SI ESTÁ VACÍA
        System.out.println("Pila Vacia: "+pila);
        System.out.println("Pila Vacia? "+pila.isEmpty());
        
        // MÉTODO PARA ELIMINAR EL ÚLTIMO ELEMENTO
        pila.pop();
        
        // MÉTODO PARA BUSCAR ELEMENTO EN LA PILA
        // BUSCA EL NÚMERO 3 SI ESTÁ IMPRIME POSITIVO o -1 EN CASO NO SE ENCUENTRE
        System.out.println(pila.search(3));
        
        // MÉTODO PARA SABER EL ÚLTIMO ELEMENTO AGREGADO
        System.out.println(pila.peek());
    }
    
}
