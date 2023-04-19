import java.util.Arrays;

public class BonusSumOfMatrix {

    // Erstellen Sie eine Matrix-Skalar-Methode 'sumOfMatrix', welche die Summe aller Einträge eines
    // 2D-Double-Arrays x berechnet und als Double zurückgibt.

    public static double sumOfMatrix(double x[][]) {
        double skalarSum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                skalarSum += x[i][j];
            }
        }
        return skalarSum;
    }

    public static void main(String[] args) {
        System.out.println(
                sumOfMatrix(new double[][] {{0, 1, -2}, {3, -4, 5}, {-6, 7, -8}, {9, -10, 11}}));
        // 6.0
        System.out.println(
                sumOfMatrix(new double[][] {{0, -1, 2}, {-3, 4, -5}, {6, -7, 8}, {-9, 10, -11}}));
        // -6.0
        System.out.println(sumOfMatrix(new double[][] {{-2, -1, 0}, {-1, 0, 1}, {0, 1, 2}}));
        // 0.0
        System.out.println(sumOfMatrix(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}}));
        // -61.0
        System.out
                .println(sumOfMatrix(new double[][] {{9, 4, 6}, {1, 5, 3}, {7, 2, 9}, {8, 3, 4}}));
        // 61.0
    }

}
