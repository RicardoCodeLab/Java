package Enums;

public class Enumeraciones {
    enum DiaSemana {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    public static void main(String[] args) {
        DiaSemana dia1 = DiaSemana.LUNES;
        System.out.println(dia1+"\n");

        // Método values() para imprimir los valores del enumerado
        for(DiaSemana semana : DiaSemana.values()){
            System.out.println(semana);
        }

        DiaSemana primerdia = DiaSemana.LUNES;
        // Método name() sirve para que nos brinde el valor de variable
        System.out.println(primerdia.name());

        // Método ordinal() nos brinda la posición del valor en el enum
        System.out.println(primerdia.ordinal());

        // Método valueOf() nos brinda el valor
        dia1 = DiaSemana.valueOf("DOMINGO");
        System.out.println(dia1);
    }
}
