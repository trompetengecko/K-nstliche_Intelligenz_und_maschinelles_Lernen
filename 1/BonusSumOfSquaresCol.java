import java.util.Arrays;

public class BonusSumOfSquaresCol {

    // Erstellen Sie eine Matrix-Vektor-Methode 'sumOfSquaresCol', welche die Summe der Quadrate der
    // einzelnen Spalten eines 2D-Double-Arrays x berechnet und als Double zurückgibt.

    public static double[] sumOfSquaresCol(double x[][]) {
        double returnVector[] = new double[x[0].length];
        for (int i = 0; i < x[0].length; i++) {
            for (int j = 0; j < x.length; j++) {
                returnVector[i] += Math.pow(x[j][i], 2);
            }
        }
        return returnVector;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfSquaresCol(
                new double[][] {{0, 1, -2}, {3, -4, 5}, {-6, 7, -8}, {9, -10, 11}})));
        // [126.0, 166.0, 214.0]
        System.out.println(Arrays.toString(sumOfSquaresCol(
                new double[][] {{0, -1, 2}, {-3, 4, -5}, {6, -7, 8}, {-9, 10, -11}})));
        // [126.0, 166.0, 214.0]
        System.out.println(Arrays
                .toString(sumOfSquaresCol(new double[][] {{-2, -1, 0}, {-1, 0, 1}, {0, 1, 2}})));
        // [5.0, 2.0, 5.0]
        System.out.println(Arrays.toString(sumOfSquaresCol(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}})));
        // [195.0, 54.0, 142.0]
        System.out.println(Arrays.toString(
                sumOfSquaresCol(new double[][] {{9, 4, 6}, {1, 5, 3}, {7, 2, 9}, {8, 3, 4}})));
        // [195.0, 54.0, 142.0]
    }

}
