import java.util.Arrays;

public class BonusMatrixProdSum {

    // Schreiben Sie eine Methode, die eine Matrix x (vom Typ Double) als Parameter erwartet und ein
    // Skalar (vom Typ Double) zurückgibt.
    // Bilden Sie dazu zuerst die Summe über die Spalten der Matrix x und anschließend das Produkt
    // über die Zeilen der Matrix x.

    public static double matrixProdSum(double x[][]) {
        double prod = 1.;

        double sum;
        for (int i = 0; i < x.length; i++) {
            sum = 0.;
            for (int j = 0; j < x[0].length; j++) {
                sum += x[i][j];
            }
            prod *= sum;
        }

        return prod;
    }

    public static void main(String[] args) {
        System.out.println(
                matrixProdSum(new double[][] {{0, 1, -2}, {3, -4, 5}, {-6, 7, -8}, {9, -10, 11}}));
        // 280.0
        System.out.println(
                matrixProdSum(new double[][] {{0, -1, 2}, {-3, 4, -5}, {6, -7, 8}, {-9, 10, -11}}));
        // 280.0
        System.out.println(matrixProdSum(new double[][] {{-2, -1, 0}, {-1, 0, 1}, {0, 1, 2}}));
        // -0.0
        System.out.println(matrixProdSum(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}}));
        // 46170.0
        System.out.println(
                matrixProdSum(new double[][] {{9, 4, 6}, {1, 5, 3}, {7, 2, 9}, {8, 3, 4}}));
        // 46170.0
    }

}
