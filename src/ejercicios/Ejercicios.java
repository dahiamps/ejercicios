/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author dahia
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*1)*/
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite la cantidad de dinero de juan");
        int dineroJuan = leer.nextInt();
        int dineroCamilla = dineroJuan / 2;

        int dineroRicardo = (dineroJuan + dineroCamilla) / 2;

        System.out.println("El dinero de Juan es: $" + dineroJuan);
        System.out.println("El dinero de Camila es: $" +dineroCamilla);
        System.out.println("El dinero de ricardo es: $" + dineroRicardo);

    }

}
