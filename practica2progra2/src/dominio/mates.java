package dominio;

import java.util.Random;

public class mates {

    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo.
     * El parámetro 'steps' indica el número de puntos generados.
     *
     * @param totalPoints Número de puntos generados.
     * @return Aproximación al número pi.
     */
    public static double calculatePiUsingMonteCarlo(long totalPoints) {
        long pointsInsideCircle = 0;
        double squareArea = 4;

        for (long i = 1; i < totalPoints; i++) {
            Random random = new Random();
            double x = random.nextDouble();
            double y = random.nextDouble();

            if ((x * x + y * y) <= 1) {
                pointsInsideCircle++;
            }
        }

        return squareArea * pointsInsideCircle / totalPoints;
    }
}
