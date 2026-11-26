
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
public class Ejemplo061 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        
        while(bandera == true){
            System.out.println("Estoy en el ciclo");//Estoy en el ciclo
            
            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100");
            salir = entrada.nextInt();//100 == -100
            if(salir == -100){
                bandera = false;
            }
        }
        
    }
}
/*
Acabamos de crear un ciclo infinito pero lo redujimos con una condición if
para decirle al ususario que si quiere salir que anote -100. Si anota otro 
número que no es -100 seguirá en el ciclo infinitamente.
*/