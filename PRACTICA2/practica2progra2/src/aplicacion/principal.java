package aplicacion;

import java.util.Scanner;

import dominio.mates;

/**
 * Clase principal que contiene el método main para calcular PI utilizando simulación por Montecarlo de forma recursiva.
 */
public class principal {

    /**
     * Método principal para iniciar el programa.
     * Solicita al usuario el número de dardos a lanzar y muestra el valor aproximado de PI.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir número de dardos: ");
        int numeroPasos = sc.nextInt();

        System.out.println("El número pi es " + mates.numeropiRecursivo(numeroPasos));
        sc.close();
    }
}

