import java.util.Arrays;

public class KI_3_4_sm {

        // Implementieren Sie die Softmax-Funktion sm(x): sie nimmt ein double-Array 'x' (1D) und
        // liefert ein double-Array der selben Länge zurück. Hierbei soll die Formel aus der
        // Vorlesung gelten: yi=exp(xi)∑jexp(xj). Für die Berechnung der Exponentialfunktion
        // benutzen Sie Math.exp. Sobald die Funktion tut wass sie soll: überzeugen Sie sich, dass
        // die Ausgabe tatsächlich die Bedingungen für eine Wahrscheinlichkeitsverteilung erfüllt.

        public static double[] sm(double[] x) {
                double returnVector[] = new double[x.length];
                double expr = 0;
                for (int i = 0; i < x.length; i++) {
                        expr += Math.exp(x[i]);
                }
                for (int i = 0; i < x.length; i++) {
                        returnVector[i] = Math.exp(x[i]) / expr;
                }
                return returnVector;
        }



        public static void main(String[] args) {
                double[] T1 = new double[] {10., 10.};
                System.out.println(java.util.Arrays.toString(sm(T1)));
                // [0.5, 0.5]
                double[] T2 = new double[] {-10., -10.};
                System.out.println(java.util.Arrays.toString(sm(T2)));
                // [0.5, 0.5]
        }

}
