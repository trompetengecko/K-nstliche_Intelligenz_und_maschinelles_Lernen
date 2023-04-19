import java.util.Arrays;

public class BonusSumOfMatrixCol {

    // Schreiben Sie eine Methode, die eine Matrix x (vom Typ Double) als Parameter erwartet und
    // eine Matrix (vom Typ Double) mit genauso vielen Spalten, aber nur einer Zeile zurückgibt.
    // Jede Spalte soll also aus nur exakt einem Element bestehen, welches die Summe der zugehörigen
    // Spalte von x repräsentiert. Sie können davon ausgehen dass die Matrix mindestens eine Zeile
    // enthält.


    public static double[][] sumOfMatrixCol(double x[][]) {
        double returnMatrix[][] = new double[1][x[0].length];

        for (int i = 0; i < x[0].length; i++) {
            for (int j = 0; j < x.length; j++) {
                returnMatrix[0][i] += x[j][i];
            }
        }
        return returnMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sumOfMatrixCol(
                new double[][] {{0, +1, -2}, {+3, -4, +5}, {-6, +7, -8}, {+9, -10, +11}})));
        // [[6.0, -6.0, 6.0]]
        System.out.println(Arrays.deepToString(sumOfMatrixCol(
                new double[][] {{0, -1, +2}, {-3, +4, -5}, {+6, -7, +8}, {-9, +10, -11}})));
        // [[-6.0, 6.0, -6.0]]
        System.out.println(Arrays.deepToString(
                sumOfMatrixCol(new double[][] {{-2, -1, 0}, {-1, 0, +1}, {0, +1, +2}})));
        // [[-3.0, 0.0, 3.0]]
        System.out.println(Arrays.deepToString(sumOfMatrixCol(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}})));
        // [[-25.0, -14.0, -22.0]]
        System.out.println(Arrays.deepToString(sumOfMatrixCol(
                new double[][] {{+9, +4, +6}, {+1, +5, +3}, {+7, +2, +9}, {+8, +3, +4}})));
        // [[25.0, 14.0, 22.0]]

    }

}
