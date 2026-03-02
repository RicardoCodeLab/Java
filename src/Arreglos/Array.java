package Arreglos;
public class Array {
    public static void main(String[] args) {
        // Inicializar Array
        // Tipo_de_dato [] Nombre_Arreglo = new Tipo_de_dato [dimensión]
         float[] estatura = new float[3];   // Arreglo float
         double[] tamaño = new double[3];   // Arreglo double
         boolean[] estado = new boolean[5]; // Arreglo boolean
         char[] sexo = new char[2];         // Arreglo char
         String[] nombre = new String[2];   // Arreglo String
         
         int[] edad = new int[4];   //Arreglo int y como ingresar datos
         edad[0]=18;
         edad[1]=19;
         edad[2]=20;
         edad[3]=21;
         System.out.println("El arreglo 'edad' tiene los elementos: ");
         for(int i=0;i<4;i++){
             // Imprimir el arreglo pantalla
             System.out.println(edad[i]);
         }
         System.out.println("El arreglo 'mejores' tiene los elementos: ");
         long[] mejores = {18,19,20,21}; // Arreglo los e ingresamos datos
         System.out.println(mejores[0]);
         System.out.println(mejores[1]);
         System.out.println(mejores[2]);
         System.out.println(mejores[3]);
    }
}
