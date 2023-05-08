import java.util.Arrays;

public class KI_3_2_matMul {

        // Eine Matrixmultiplikation kann auch auf eine Sammlung von Datenvektoren angewendet
        // werden: implementieren Sie die Matrix-Multiplikation im Linear Softmax-Modell, diesmal
        // nicht für auf einen einzelnen Datenvektor x, sondern für eine Matrix X (mit den einzelnen
        // Datenvektoren als Zeilen). Dafür soll eine Funktion 'matMul' implementiert werdem, die
        // ein 2D-Array 'W' und ein 2D-Array 'X' als Parameter erwartet und das Ergebnis der
        // Matrix-Multiplikation XW als 2D-Array zurückgibt. Sie sollten prüfen ob die Dimensionen
        // von W und X übereinstimmen, d.h., es kann eine MM durchgeführt werden. Falls nicht soll
        // null zurückgegeben werden. Die Länge der Rückgabematrix soll aus den Dimensionen von W
        // und X bestimmt werden. Hinweis: mit Copy&Paste von der vorherigen Aufgabe kommt man recht
        // weit...

        public static double[][] matMul(double[][] W, double[][] X) {
                if (W[0].length != X[0].length || W[0].length != X.length) {
                        return null;
                }

                double returnMatrix[][] = new double[W.length][X[0].length];

                if (W.length != X.length) {
                        for (int i = 0; i < W.length; i++) {
                                for (int j = 0; j < W[0].length; j++) {

                                        returnMatrix[i][j] += X[i][j] * W[0][j];
                                }
                        }


                } else {
                        for (int i = 0; i < X.length; i++) {
                                for (int j = 0; j < W[0].length; j++) {
                                        for (int k = 0; k < X[0].length; k++) {
                                                returnMatrix[i][j] += X[i][k] * W[k][j];
                                        }
                                }
                        }

                }

                // returnMatrix[0][0] += X[0][0] * W[0][0];
                // returnMatrix[0][0] += X[0][1] * W[1][0];

                // returnMatrix[0][1] += X[0][0] * W[0][1];
                // returnMatrix[0][1] += X[0][1] * W[1][1];

                // returnMatrix[1][0] += X[1][0] * W[0][0];
                // returnMatrix[1][0] += X[1][1] * W[1][0];

                // returnMatrix[1][1] += X[1][0] * W[0][1];
                // returnMatrix[1][1] += X[1][1] * W[1][1];


                return returnMatrix;
        }



        public static void main(String[] args) {

                double[][] W1 = new double[][] {{1., 1.}, {1., 1.}};
                System.out.println(java.util.Arrays
                                .deepToString(matMul(new double[][] {{2., 2.}}, W1)));
                // [[4.0, 4.0]]
                double[][] W2 = new double[][] {{1., 1.}, {1., 1.}};
                System.out.println(java.util.Arrays
                                .deepToString(matMul(new double[][] {{2., 2., 2.}}, W2)));
                // null
                double[][] W3 = new double[][] {{-1., 0.}, {-1., 0.}};
                System.out.println(java.util.Arrays
                                .deepToString(matMul(new double[][] {{2., 2.}}, W3)));
                // [[-4.0, 0.0]]
                double[][] W3b = new double[][] {{-1., 0.}, {-1., 0.}};
                System.out.println(java.util.Arrays
                                .deepToString(matMul(new double[][] {{2., 2.}, {1., 1.}}, W3b)));
                // [[-4.0, 0.0], [-2.0, 0.0]]
                double[][] W4 = new double[][] {{-1., 0.}, {-1., 1.}};
                System.out.println(java.util.Arrays
                                .deepToString(matMul(new double[][] {{2., 2.}, {1., 0.}}, W4)));
                // [[-4.0, 2.0], [-1.0, 0.0]]
                double[][] W5 = new double[][] {{-1., 0.}, {-1., 1.}, {1., 0.}};
                System.out.println(java.util.Arrays
                                .deepToString(matMul(new double[][] {{2., 2.}}, W5)));
                // null
        }

}
