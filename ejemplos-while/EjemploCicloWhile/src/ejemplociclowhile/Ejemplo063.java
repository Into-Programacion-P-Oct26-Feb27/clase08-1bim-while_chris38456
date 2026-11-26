
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo063 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        int contador = 0;
        int limite = 5;
        String pais;
        String capital;
        String reporte;
        String cadenaFinal = "";

        while (bandera == true) {
            contador = contador + 1;

            System.out.println("Ingrese el país " + contador + ":");
            pais = entrada.nextLine();

            System.out.println("Ingrese la capital de " + pais + ":");
            capital = entrada.nextLine();

            cadenaFinal = cadenaFinal + pais + " - " + capital + "\n";

            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }

            if (contador == limite) {
                bandera = false;
            }
        }
                reporte = String.format("Listado de Países y Capitales:\n%s",
                cadenaFinal, contador);

        System.out.printf("%s\n",reporte);
    }
}