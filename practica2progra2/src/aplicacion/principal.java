/**
 * Clase principal que contiene el programa para obtener la aproximación al
 * número pi mediante el método de Montecarlo.
 */
package aplicacion;

import dominio.mates;

import java.util.Scanner;

public class principal {

    /**
     * Método principal para ejecutar el programa.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     *             programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de puntos que desea utilizar: ");

        long totalPoints = scanner.nextInt();

        System.out.println("El valor aproximado de Pi es: " + Matematicas.calculatePiUsingMonteCarlo(totalPoints));

        scanner.close();
    }
}
