import java.util.Arrays;

public class BonusMatrixSumProd {

    // Schreiben Sie eine Methode, die einen Matrix x (vom Typ Double) als Parameter
    // erwartet und ein Skalar (vom Typ Double) zurückgibt.
    // Bilden Sie dazu zuerst das Produkt über die Zeilen der Matrix x und
    // anschließend die Summe über die Spalten der Matrix x.

    public static double matrixSumProd(double x[][]) {
        double[][] twoD = new double[1][x[0].length];
        double sumAggregat = 0;
        for (int i = 0; i < x[0].length; i++) {
            double prodAggregat = 1;
            for (int j = 0; j < x.length; j++) {
                prodAggregat *= x[j][i];

            }
            twoD[0][i] = prodAggregat;
        }
        for (int i = 0; i < x[0].length; i++) {
            sumAggregat += twoD[0][i];

        }
        return sumAggregat;
    }

    public static void main(String[] args) {

        System.out.println(
                matrixSumProd(new double[][] {{0, 1, -2}, {3, -4, 5}, {-6, 7, -8}, {9, -10, 11}}));
        // 1160.0
        System.out.println(
                matrixSumProd(new double[][] {{0, -1, 2}, {-3, 4, -5}, {6, -7, 8}, {-9, 10, -11}}));
        // 1160.0
        System.out.println(matrixSumProd(new double[][] {{-2, -1, 0}, {-1, 0, 1}, {0, 1, 2}}));
        // 0.0
        System.out.println(matrixSumProd(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}}));
        // 1272.0
        System.out.println(
                matrixSumProd(new double[][] {{9, 4, 6}, {1, 5, 3}, {7, 2, 9}, {8, 3, 4}}));
        // 1272.0

    }

}
