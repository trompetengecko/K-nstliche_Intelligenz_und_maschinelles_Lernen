import java.util.Arrays;

public class ModelExample {

    // Schreiben Sie eine Methode, die ein 2D-double-Array x als Parameter erwartet
    // und ein 2D-double-Array mit genauso vielen Zeilen aber nur einer Spalte
    // zurückgibt. Jede Zeile soll ein Element lang sein und den ersten Wert der
    // selben Zeile von x enthalten.

    public static double[][] modelExample(double[][] x) {
        double[][] twoD = new double[x.length][1];
        if (x.length > 0) {
            for (int i = 0; i < x.length; i++) {
                twoD[i][0] = x[i][0];
            }
        }
        return twoD;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(modelExample(new double[][] {})));
        // []
        // []
        System.out.println(
                Arrays.deepToString(modelExample(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
        // [[1.0], [2.0], [3.0]]
        // [[1.0], [2.0], [3.0]]
        System.out.println(Arrays.deepToString(modelExample(new double[][] { { 1., 2. }, { 1., 2. }, { 1., 2. } })));
        // [[1.0], [1.0], [1.0]]
        // [[1.0], [1.0], [1.0]]
        System.out.println(Arrays.deepToString(modelExample(new double[][] { { -3.0, 1.0, 2.0, 3.0 } })));
        // [[-3.0]]
        // [[-3.0]]
        System.out.println(Arrays.deepToString(modelExample(new double[][] { { 1., 2. }, { 1., 0. } })));
        // [[1.0], [1.0]]
        // [[1.0], [1.0]]
        System.out.println(Arrays.deepToString(modelExample(new double[][] { { -5., 0. }, { -1., 1. }, { -2., 2. } })));
        // [[-5.0], [-1.0], [-2.0]]
        // [[-5.0], [-1.0], [-2.0]]

    }

}