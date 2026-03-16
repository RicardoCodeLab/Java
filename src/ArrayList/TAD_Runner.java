package ArrayList;

import java.util.Scanner;

public class TAD_Runner {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido;
        int telefono = 0;

        boolean esFinal = true;
        while (esFinal) {
            System.out.println("Ingresar la opcion");
            System.out.println("1. Ingresar");
            System.out.println("2. Consultar");
            System.out.println("3. Borrar");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el nombre");
                nombre = sc.next();
                System.out.println("Ingrese el apellido");
                apellido = sc.next();
                System.out.println("Ingrese el telefono");
                telefono = sc.nextInt();

                agenda.insertarContacto(nombre, apellido, telefono);
            } else if (opcion == 2) {
                agenda.buscarContacto(telefono);
            } else if (opcion == 3) {
                agenda.eliminarContacto(telefono);
            }
            System.out.println("Desea terminar el programa ? SI/NO");
            if (sc.next().equals("SI"))
                esFinal = false;
        }
    }  
}
