import java.util.Arrays;

public class LinearClassifier {

    // Schreiben Sie eine Methode, die ein 2D-double-Array 'x' als Parameter
    // erwartet und ein 2D-double-Array mit genauso vielen Zeilen aber nur einer
    // Spalte zurückgibt. Der einzelne Eintrag in jeder Zeile soll dem Skalarprodukt
    // des Parameters 'w' mit der selben Zeile von x entsprechen

    public static double[][] linearClassifier(double[][] x, double[] w) {
        double[][] twoD = new double[x.length][1];

        double result = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                twoD[i][0] += x[i][j] * w[j];
            }
        }

        return twoD;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(linearClassifier(new double[][] {},
                new double[] { 1.0, 0.0 })));
        // []
        System.out.println(Arrays.deepToString(
                linearClassifier(new double[][] { { 1., 1. }, { 2., 2. }, { 3., 3. } }, new double[] { 1.0, 0.0 })));
        // [[1.0], [2.0], [3.0]]
    }

}