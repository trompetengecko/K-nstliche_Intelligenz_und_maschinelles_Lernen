import java.util.Arrays;

public class crossEntropy_2_6 {

        // Implementieren Sie die Kreuzentropie-Zielfunktion ('cross entropy loss') in einer Methode
        // 'crossEntropy', welche als Parameter ein 2D-Array Y und ein 2D-Array T erhält, welche die
        // Modellfunktionsoutputs sowie die Zielwerte eines Problems repräsentieren. Hier wird ein
        // Klassifikationsproblem behandelt, d.h. die Zeilenvektoren des Zielwert-Arrays T
        // repräsentieren diskrete Klassen: falls Klasse k gemeint ist, steht an der Stelle k im
        // Zeilenvektor eine 1 und 0 überall sonst. Klar ist: ein Zielwert-Vektor der Länge K kann
        // auf diese Weise genau K verschiedene Klassen repräsentieren. Die Zahl der Zeilen darf als
        // > 0 angenommen werden, die Zahl der Spalten in Y und T ist identisch und kann aus der
        // ersten Zeile bestimmt werden. Die Modelloutputs Y sind garantiert im [0,1]-Intervall und
        // repräsentieren die Wahrscheinlichkeiten, die das Modell für eine bestimmte Klasse
        // berechnet hat. Die Kreuzentropie berechnet sich anhand der Formel LCE=−1N∑i∑jlog(yij)tij
        // . Die Logarithmusfunktion kann durch Math.log bestimmt werden, keine Imports nötig. Zum
        // Nachdenken: Was sind obere und untere Schranken für diese Zielfunktion? Wann werden sie
        // erreicht?

        public static double crossEntropy(double[][] Y, double[][] T) {
                double cEntropy = 0;
                for (int i = 0; i < Y.length; i++) {
                        for (int j = 0; j < Y[i].length; j++) {
                                cEntropy += Math.log(Y[i][j]) * T[i][j];
                        }
                }

                return -1 * cEntropy / Y.length;
        }



        public static void main(String[] args) {

                double[][] T1 = new double[][] {{1., 0., 0.}, {0., 0., 1.}, {0., 1., 0.}};
                System.out.println(crossEntropy(
                                new double[][] {{0.5, 0.4, 0.1}, {0.4, 0.1, 0.5}, {0.1, 0.8, 0.1}},
                                T1));
                // 0.5364793041447001
                double[][] T2 = new double[][] {{1., 0., 0., 0.}, {0., 0., 1., 0.},
                                {0., 1., 0., 0.}};
                System.out.println(crossEntropy(new double[][] {{1., 0.01, 0.01, 0.01},
                                {0.01, 0.01, 1., 0.01}, {0.01, 1., 0.01, 0.01}}, T2));
                // -0.0
                double[][] T3 = new double[][] {{1., 0., 0., 0.}, {0., 0., 1., 0.},
                                {0., 1., 0., 0.}};
                System.out.println(crossEntropy(new double[][] {{0.4, 0.5, 0.05, 0.05},
                                {0.1, 0.3, 0.4, 0.2}, {0.05, 0.45, 0.4, 0.1}}, T3));
                // 0.8770297199886938
                double[][] T4 = new double[][] {{1., 0.}, {0., 1.}, {0., 1.}, {1., 0.}};
                System.out.println(crossEntropy(
                                new double[][] {{0.1, 0.9}, {0.9, 0.1}, {0.1, 0.9}, {0.1, 0.9}},
                                T4));
                // 1.7532789486599905
                double[][] T5 = new double[][] {{1., 0.}, {0., 1.}, {0., 1.}, {1., 0.}};
                System.out.println(crossEntropy(
                                new double[][] {{0.01, 1.0}, {1., 0.01}, {1., 0.01}, {1.0, 0.01}},
                                T5));
                // 3.4538776394910684
        }

}
