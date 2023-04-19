import java.util.Arrays;

public class BonusSumOfMatrixRow {

    // Schreiben Sie eine Methode, die eine Matrix x (vom Typ Double) als Parameter erwartet und
    // eine Matrix (vom Typ Double) mit genauso vielen Zeilen, aber nur einer Spalte zurückgibt.
    // Jede Zeile soll also aus nur exakt einem Element bestehen, welches die Summe der zugehörigen
    // Zeile von x repräsentiert.
    // Sie können davon ausgehen dass die Matrix mindestens eine Spalte enthält.

    public static double[][] sumOfMatrixRow(double x[][]) {
        double[][] returnMatrix = new double[x.length][1];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                returnMatrix[i][0] += x[i][j];
            }
        }
        return returnMatrix;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(sumOfMatrixRow(
                new double[][] {{0, +1, -2}, {+3, -4, +5}, {-6, +7, -8}, {+9, -10, +11}})));
        // [[-1.0], [4.0], [-7.0], [10.0]]
        System.out.println(Arrays.deepToString(sumOfMatrixRow(
                new double[][] {{0, -1, +2}, {-3, +4, -5}, {+6, -7, +8}, {-9, +10, -11}})));
        // [[1.0], [-4.0], [7.0], [-10.0]]
        System.out.println(Arrays.deepToString(
                sumOfMatrixRow(new double[][] {{-2, -1, 0}, {-1, 0, +1}, {0, +1, +2}})));
        // [[-3.0], [0.0], [3.0]]
        System.out.println(Arrays.deepToString(sumOfMatrixRow(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}})));
        // [[-19.0], [-9.0], [-18.0], [-15.0]]
        System.out.println(Arrays.deepToString(sumOfMatrixRow(
                new double[][] {{+9, +4, +6}, {+1, +5, +3}, {+7, +2, +9}, {+8, +3, +4}})));
        // [[19.0], [9.0], [18.0], [15.0]]
    }

}
