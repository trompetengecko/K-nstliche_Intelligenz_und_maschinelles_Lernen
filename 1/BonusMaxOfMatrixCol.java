import java.util.Arrays;

public class BonusMaxOfMatrixCol {

    // Schreiben Sie eine Methode, die eine Matrix x (vom Typ Integer) als Parameter erwartet und
    // einen Vektor (vom Typ Integer) zurückgibt.
    // Die Elemente des Vektors sollen den größten Wert der jeweiligen Spalte von x widerspiegeln.

    public static int[] maxOfMatrixCol(int x[][]) {
        int[] maxVector = new int[x[0].length];
        for (int i = 0; i < x[0].length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < x.length; j++) {
                if (x[j][i] > maxValue) {
                    maxValue = x[j][i];
                }
                maxVector[i] = maxValue;
            }
        }

        return maxVector;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(maxOfMatrixCol(
                new int[][] {{0, +1, -2}, {+3, -4, +5}, {-6, +7, -8}, {+9, -10, +11}})));
        // [9, 7, 11]
        System.out.println(Arrays.toString(maxOfMatrixCol(
                new int[][] {{0, -1, +2}, {-3, +4, -5}, {+6, -7, +8}, {-9, +10, -11}})));
        // [6, 10, 8]
        System.out.println(Arrays
                .toString(maxOfMatrixCol(new int[][] {{-2, -1, 0}, {-1, 0, +1}, {0, +1, +2}})));
        // [0, 1, 2]
        System.out.println(Arrays.toString(maxOfMatrixCol(
                new int[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}})));
        // [-1, -2, -3]
        System.out.println(Arrays.toString(maxOfMatrixCol(
                new int[][] {{+9, +4, +6}, {+1, +5, +3}, {+7, +2, +9}, {+8, +3, +4}})));
        // [9, 5, 9]
    }

}
