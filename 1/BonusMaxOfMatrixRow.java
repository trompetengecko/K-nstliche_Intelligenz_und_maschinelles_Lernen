import java.util.Arrays;

public class BonusMaxOfMatrixRow {

    // Schreiben Sie eine Methode, die eine Matrix x (vom Typ Integer) als Parameter erwartet und
    // einen Vektor (vom Typ Integer) zurückgibt.
    // Die Elemente des Vektors sollen den größten Wert der jeweiligen Zeile von x widerspiegeln.

    public static int[] maxOfMatrixRow(int x[][]) {
        int[] returnVector = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < x[0].length; j++) {
                if (maxValue < x[i][j]) {
                    maxValue = x[i][j];
                }
            }
            returnVector[i] = maxValue;
        }
        return returnVector;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxOfMatrixRow(
                (new int[][] {{0, +1, -2}, {+3, -4, +5}, {-6, +7, -8}, {+9, -10, +11}}))));
        // [1, 5, 7, 11]
        System.out.println(Arrays.toString(maxOfMatrixRow(
                (new int[][] {{0, -1, +2}, {-3, +4, -5}, {+6, -7, +8}, {-9, +10, -11}}))));
        // [2, 4, 8, 10]
        System.out.println(Arrays
                .toString(maxOfMatrixRow((new int[][] {{-2, -1, 0}, {-1, 0, +1}, {0, +1, +2}}))));
        // [0, 1, 2]
        System.out.println(Arrays.toString(maxOfMatrixRow(
                (new int[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}}))));
        // [-4, -1, -2, -3]
        System.out.println(Arrays.toString(maxOfMatrixRow(
                (new int[][] {{+9, +4, +6}, {+1, +5, +3}, {+7, +2, +9}, {+8, +3, +4}}))));
        // [9, 5, 9, 8]
    }

}
