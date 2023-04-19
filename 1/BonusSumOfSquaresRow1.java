import java.util.Arrays;

public class BonusSumOfSquaresRow1 {

    // Erstellen Sie eine Matrix-Vektor-Methode 'sumOfSquaresRow', welche die Summe der Quadrate der
    // einzelnen Zeilen eines 2D-Double-Arrays x berechnet und als Double zurückgibt.

    public static double[] sumOfSquaresRow(double x[][]) {
        double[] vector = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                vector[i] += Math.pow(x[i][j], 2);
            }
        }
        return vector;
    }

    public static void main(String[] args) {



        System.out.println(Arrays.toString(sumOfSquaresRow(
                new double[][] {{0, 1, -2}, {3, -4, 5}, {-6, 7, -8}, {9, -10, 11}})));
        // [5.0, 50.0, 149.0, 302.0]
        System.out.println(Arrays.toString(sumOfSquaresRow(
                new double[][] {{0, -1, 2}, {-3, 4, -5}, {6, -7, 8}, {-9, 10, -11}})));
        // [5.0, 50.0, 149.0, 302.0]
        System.out.println(Arrays
                .toString(sumOfSquaresRow(new double[][] {{-2, -1, 0}, {-1, 0, 1}, {0, 1, 2}})));
        // [5.0, 2.0, 5.0]
        System.out.println(Arrays.toString(sumOfSquaresRow(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}})));
        // [133.0, 35.0, 134.0, 89.0]
        System.out.println(Arrays.toString(
                sumOfSquaresRow(new double[][] {{9, 4, 6}, {1, 5, 3}, {7, 2, 9}, {8, 3, 4}})));
        // [133.0, 35.0, 134.0, 89.0]
    }

}
