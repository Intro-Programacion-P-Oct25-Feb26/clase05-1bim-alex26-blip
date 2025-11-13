/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String usuario;
        String parroquia;
        int edad;
        int diaPago;
        double mensualidad = 25;
        double totalDes;
        double total;

        System.out.println("Ingrese el nombre por favor:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su apellido por favor:");
        apellido = entrada.nextLine();

        System.out.println("Ingrese su usuario por favor:");
        usuario = entrada.nextLine();

        System.out.println("Ingrese su parroquia por favor:");
        parroquia = entrada.nextLine();

        System.out.println("Ingrese su edad por favor:");
        edad = entrada.nextInt();

        System.out.println("Ingrese el día a pagar promedio por favor:");
        diaPago = entrada.nextInt();

        if ((diaPago < 10) && (parroquia.equals("El Valle")
                || parroquia.equals("El Sagrario"))) {
            totalDes = (mensualidad * 0.05);
            total = (mensualidad - totalDes);

            System.out.printf(
                    "nombre: %s\napellido: %s\nusuario: %s\nedad:"
                    + " %d\nParroquia: %s\nDía de Pago: %d\nMensualidad:"
                    + " $%.2f\nDescuento: $%.2f\nTotal a pagar: $%.2f\n",
                    nombre, apellido, usuario, edad, parroquia, diaPago,
                    mensualidad, totalDes, total
            );
        } else {
            System.out.printf(
                    "nombre: %s\napellido: %s\nusuario: %s\nedad:"
                    + " %d\nParroquia: %s\nDía de Pago: %d\nMensualidad:"
                    + " $%.2f\nDescuento: $0.00\nTotal a Pagar: $%.2f\n",
                    nombre, apellido, usuario, edad, parroquia, diaPago,
                    mensualidad, mensualidad
            );
        }

        entrada.close();
    }
}
