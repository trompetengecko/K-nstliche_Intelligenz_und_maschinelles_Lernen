import java.util.Arrays;

public class KI_3_4_sm {

        // Implementieren Sie eine Funktion cosinusSteigung, welche die double-Parameter x und eps
        // akzeptiert und als Ergebnis die Steigung a linke klammer x Komma ϵ rechte klammer der
        // Funktion f linke klammer x rechte klammer gleich x im Quadrat an der Stelle x, mit
        // Schrittweite eps, zurückliefert!

        public static double cosinusSteigung(double x, double eps) {
                return 0.0;

        }



        public static void main(String[] args) {

                System.out.printf("%.04f\n", cosinusSteigung(0, 1));
                // 1.0000
                System.out.printf("%.04f\n", cosinusSteigung(0, 0.5));
                // 0.5000
                System.out.printf("%.04f\n", cosinusSteigung(0, 0.1));
                // 0.1000
                System.out.printf("%.04f\n", cosinusSteigung(0, 0.05));
                // 0.0500
                System.out.printf("%.04f\n", cosinusSteigung(0, 0.01));
                // 0.0100
        }

}
