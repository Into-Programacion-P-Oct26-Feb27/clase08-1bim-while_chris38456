/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 3;
        int contador = 1;
        double suma_total = 0;

        double promedio_final;
        double calificacion;
        String nombre;
        String apellido;

        System.out.println("Ingrese el nombre del estudiante:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido del estudiante:");
        apellido = entrada.nextLine();

        String cadena_final = String.format("Las notas de %s, %s son:\n",
                nombre, apellido);

        System.out.println("Ingrese las notas del estudiante de su "
                + "materia");

        while (contador <= limite) {
            System.out.printf("Ingrese calificación "
                    + "número %d\n", contador);
            calificacion = entrada.nextDouble();
            suma_total = suma_total + calificacion;
            cadena_final = String.format("%s%d: %.2f\n",
                    cadena_final, contador, calificacion);
            // contador
            contador = contador + 1;
        }

        promedio_final = suma_total / limite;
        cadena_final = String.format("%sLa suma de notas es: %.2f\n",
                cadena_final, suma_total);
        cadena_final = String.format("%sPromedio es: %.2f\n",
                cadena_final, promedio_final);

        System.out.printf("%s\n", cadena_final);

    }
}
/*
La cadena final está acumulando valores de tipo double para presentar en un
reporte final ordenado y claro, luego suma los valores, los divide para 3 y
obtiene un promedio de las calificaciones dadas. 
*/