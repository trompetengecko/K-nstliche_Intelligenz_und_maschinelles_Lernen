import java.util.Arrays;

public class mse_2_7 {

        // Implementieren Sie die MSE-Zielfunktion in einer Methode 'mse', welche als Parameter ein
        // 2D-Array Y und ein 2D-Array T erhält, welche die Modellfunktionsoutputs sowie die
        // Zielwerte eines Problems repräsentieren. Die Zahl der Zeilen darf als > 0 angenommen
        // werden, die Zahl der Spalten in Y und T ist identisch und kann aus der ersten Zeile
        // bestimmt werden.

        public static double mse(double[][] Y, double[][] T) {
                double regression = 0;
                for (int i = 0; i < Y.length; i++) {
                        for (int j = 0; j < Y[i].length; j++) {
                                regression += Math.pow((Y[i][j] - T[i][j]), 2);
                        }
                }
                return regression / Y.length;
        }



        public static void main(String[] args) {
                double[][] T1 = new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}};
                System.out.println(mse(new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}},
                                T1));
                // 0.0
                double[][] T2 = new double[][] {{1., 1., 0.5, 0.}, {1., 1., 1., 1.},
                                {1., 0., 0., 0.5}};
                System.out.println(mse(new double[][] {{1., 1., 0.5, 0.}, {1., 1., 1., 1.},
                                {1., 0., 0., 0.5}}, T2));
                // 0.0
                double[][] T3 = new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}};
                System.out.println(
                                mse(new double[][] {{1., 0.5, 0.}, {-1., -1., -1.}, {0., 0., 0.5}},
                                                T3));
                // 4.0
                double[][] T4 = new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}};
                System.out.println(mse(new double[][] {{2., 1.5, 1.}, {2., 2., 2.}, {1., 1., 1.5}},
                                T4));
                // 3.0
                double[][] T5 = new double[][] {{1., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}};
                System.out.println(mse(new double[][] {{7., 0.5, 0.}, {1., 1., 1.}, {0., 0., 0.5}},
                                T5));
                // 12.0
        }

}
