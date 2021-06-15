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
 /* Scanner leer = new Scanner(System.in);
        int dineroJuan,dineroCamilla,dineroRicardo;
        
        System.out.println("Digite la cantidad de dinero de juan");
        dineroJuan = leer.nextInt();
        
        dineroCamilla = dineroJuan / 2;
        dineroRicardo = (dineroJuan + dineroCamilla) / 2;

        System.out.println("El dinero de Juan es: $" + dineroJuan);
        System.out.println("El dinero de Camila es: $" +dineroCamilla);
        System.out.println("El dinero de ricardo es: $" + dineroRicardo);
         */
 /*2)*/
        final int SALARIO_BASE = 3500000;
        final int VALOR_COMISION = 1500000;

        Scanner leer = new Scanner(System.in);

        System.out.println("Digite la cantidad de ventas");
        int cantidadVentas = leer.nextInt();

        double totalDeducciones = (cantidadVentas * VALOR_COMISION) * 0.05;

        double comisionDeducida = (cantidadVentas * VALOR_COMISION) - totalDeducciones;

        float salarioFinal = (float) (SALARIO_BASE + comisionDeducida);

        System.out.println("Su salario es: $" + salarioFinal);
    }

}
