import java.util.Arrays;

public class KI_3_1_matMul {

        // Als Vorbereitung für das Linear Softmax Modell: implementieren Sie die
        // Matrix-Multiplikation die in diesem Modell vorkommt. Dafür soll eine Funktion 'matMul'
        // implementiert werdem, die ein 2D-Array 'W' und ein 1D-Array 'x' als Parameter erwartet
        // und das Ergebnis der Matrix-Multiplikation als 1D-Array zurückgibt. Sie sollten prüfen ob
        // die Dimensionen von W und x übereinstimmen, d.h., es kann eine MM durchgeführt werden.
        // Falls nicht soll null zurückgegeben werden. Die Länge des Rückgabevektors soll aus den
        // Dimensionen von W und x bestimmt werden. Hintergrund: eine Matrixmultiplikation
        // transformiert einen Vektor x⃗ in einen Vektor y⃗ =Wx⃗ , wobei gilt: yi=∑jWijxj

        public static double[] matMul(double[][] W, double[] x) {
                if (W[0].length != x.length) {
                        return null;
                }

                double returnVector[] = new double[W.length];

                for (int i = 0; i < W.length; i++) {
                        for (int j = 0; j < W[i].length; j++) {
                                returnVector[i] += W[i][j] * x[j];
                        }
                }

                return returnVector;
        }



        public static void main(String[] args) {
                double[][] W1 = new double[][] {{1., 1.}, {1., 1.}};
                System.out.println(java.util.Arrays.toString(matMul(W1, new double[] {2., 2.})));
                // [4.0, 4.0]
                double[][] W2 = new double[][] {{1., 1.}, {1., 1.}};
                System.out.println(
                                java.util.Arrays.toString(matMul(W2, new double[] {2., 2., 2.})));
                // null
        }

}
