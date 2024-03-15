package dominio;

import java.util.Random;

/**
 * Clase que contiene métodos para cálculos matemáticos, incluido el cálculo de PI utilizando simulación por Montecarlo.
 */
public class mates {

    /**
     * Calcula el valor aproximado de PI utilizando simulación por Montecarlo de forma recursiva.
     * @param pasos Número de lanzamientos de dardos a realizar.
     * @return Valor aproximado de PI.
     */
    public static double numeropiRecursivo(int pasos) {
        return numeropiRecursivo(pasos, 0, 0, new Random());
    }

    private static double numeropiRecursivo(int pasos, int lanzamientos, double aciertos, Random random) {
        if (lanzamientos == pasos)
            return 4 * aciertos / pasos;
        
        double x = random.nextDouble();
        double y = random.nextDouble();
        if (x * x + y * y <= 1) {
            aciertos++;
        }
        
        return numeropiRecursivo(pasos, lanzamientos + 1, aciertos, random);
    }

    /**
     * Calcula el valor aproximado de PI utilizando simulación por Montecarlo.
     * @param pasos Número de lanzamientos de dardos a realizar.
     * @return Valor aproximado de PI.
     */
    public static double numeropi(long pasos) {
        double aciertos = 0;
        double areaCuadrado = 4;
        for (long i = 1; i < pasos; i++) {
            Random numaleatorio = new Random();
            double x = numaleatorio.nextDouble();
            double y = numaleatorio.nextDouble();
            if ((x * x + y * y) <= 1) {
                aciertos++;
            }
        }

        return areaCuadrado * aciertos / pasos;
    }
}
