import java.util.Arrays;

public class rmse_2_8 {

        // Implementieren Sie die Root Mean Squared Error (RMSE)-Zielfunktion in einer Methode
        // 'rmse', welche als Parameter ein 2D-Array Y und ein 2D-Array T erhält, welche die
        // Modellfunktionsoutputs sowie die Zielwerte eines Problems repräsentieren. Die Zahl der
        // Zeilen darf als > 0 angenommen werden, die Zahl der Spalten in Y und T ist identisch und
        // kann aus der ersten Zeile bestimmt werden. Der Unterschied zu MSE ist, dass der Betrag
        // der Differenz zwischen Modellausgabe und Zielwert nicht quadriert wird uns somit die
        // Quadratwurzel stehenbleibt. Die Quadratwurzel berechnen Sie mit der Funktion Math.sqrt
        // (kein Import nötig)

        public static double rmse(double[][] Y, double[][] T) {
                double regression[] = new double[Y.length];
                double finalReg = 0;
                for (int i = 0; i < Y.length; i++) {
                        for (int j = 0; j < Y[i].length; j++) {
                                regression[i] += Math.pow((Y[i][j] - T[i][j]), 2);
                        }
                        finalReg += Math.sqrt(regression[i]);
                }
                return finalReg / Y.length;
        }



        public static void main(String[] args) {
                double[][] T1 = new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}};
                System.out.println(rmse(new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}},
                                T1));
                // 0.0
                double[][] T2 = new double[][] {{1., 0.5, 0.}, {2., 0., 0.}, {0., 0., 0.5}};
                System.out.println(rmse(new double[][] {{1., 0.5, 0.}, {0., 0., 0.}, {0., 0., 0.5}},
                                T2));
                // 0.6666666666666666
                double[][] T3 = new double[][] {{1., 0.5, 0., 0.}, {1., 1., 1., 1.},
                                {0., 0., 0.5, 2.}};
                System.out.println(rmse(new double[][] {{1., 0.5, 0., 0.}, {1., 1., 1., 1.},
                                {0., 0., 0.5, 2.}}, T3));
                // 0.0
                double[][] T4 = new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}};
                System.out.println(rmse(new double[][] {{2., 1.5, 1.}, {2., 2., 2.}, {1., 1., 1.5}},
                                T4));
                // 1.7320508075688774
                double[][] T5 = new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}};
                System.out.println(rmse(new double[][] {{7., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}},
                                T5));
                // 2.0
        }

}
