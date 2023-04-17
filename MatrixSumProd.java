import java.util.Arrays;

public class MatrixSumProd {

    // Schreiben Sie eine Methode, die einen Matrix x (vom Typ Double) als Parameter
    // erwartet und ein Skalar (vom Typ Double) zurückgibt.
    // Bilden Sie dazu zuerst das Produkt über die Zeilen der Matrix x und
    // anschließend die Summe über die Spalten der Matrix x.

    public static double matrixSumProd(double x[][]) {
        double sumAggregat = 0;
        double prodAggregat = 1;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                prodAggregat *= x[i][j];
            }
        }

        return prodAggregat;
    }

    public static void main(String[] args) {

        System.out.println(matrixSumProd(new double[][] { { 0, 1, -2 }, { 3, -4, 5 }, { -6, 7, -8 }, { 9, -10, 11 } }));
        // 1160.0
        System.out
                .println(matrixSumProd(new double[][] { { 0, -1, 2 }, { -3, 4, -5 }, { 6, -7, 8 }, { -9, 10, -11 } }));
        // 1160.0
        System.out.println(matrixSumProd(new double[][] { { -2, -1, 0 }, { -1, 0, 1 }, { 0, 1, 2 } }));
        // 0.0
        System.out.println(
                matrixSumProd(new double[][] { { -9, -4, -6 }, { -1, -5, -3 }, { -7, -2, -9 }, { -8, -3, -4 } }));
        // 1272.0
        System.out.println(matrixSumProd(new double[][] { { 9, 4, 6 }, { 1, 5, 3 }, { 7, 2, 9 }, { 8, 3, 4 } }));
        // 1272.0

    }

}