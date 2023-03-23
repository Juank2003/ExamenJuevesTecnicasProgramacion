package mates;

import java.util.Random;

public class Matematicas {

    /**
     * Genera una aproximación al número pi mediante el método de
     * Montecarlo. El parámetro ‘pasos‘ indica el número de puntos
     * generado.
     */
    public static double generarNumeroPi(long pasos) {
        Random random = new Random();
        long puntosDentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x*x + y*y <= 1.0) {
                puntosDentroCirculo++;
            }
        }

        return 4.0 * puntosDentroCirculo / pasos;
    }
}
