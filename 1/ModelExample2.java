import java.util.Arrays;

public class ModelExample2 {

    // Schreiben Sie eine Methode, die ein 2D-double-Array x als Parameter erwartet
    // und ein 2D-double-Array mit genauso vielen Zeilen aber nur einer Spalte
    // zurückgibt. Jede Zeile soll ein Element lang sein und die Summe der selben
    // Zeile von x enthalten.

    public static double[][] modelExample(double[][] x) {
        double[][] twoD = new double[x.length][1];
        if (x.length > 0) {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i].length; j++) {
                    twoD[i][0] += x[i][j];
                }
            }
        }
        return twoD;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(modelExample(new double[][] {})));
        // []
        System.out.println(
                Arrays.deepToString(modelExample(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
        // [[3.0], [6.0], [9.0]]

    }

}