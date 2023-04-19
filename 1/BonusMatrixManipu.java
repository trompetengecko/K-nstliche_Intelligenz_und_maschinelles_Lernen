import java.util.Arrays;

public class BonusMatrixManipu {

    // Schreiben Sie eine Methode, die ein Skalar x (vom Typ Integer) sowie ein Skalar y (vom Typ
    // Integer) als Parameter erwartet und eine Matrix (vom Typ Integer) zurückgibt.
    // Die Matrix soll x ⋅ y Elemente enthalten, wobei x die Anzahl der Zeilen und y die Anzahl der
    // Spalten repräsentiert.
    // Die Elemente der Diagonalen sollen den Wert 1 aufweisen, alle anderen Elemente sollen durch
    // den Wert 0 belegt werden.

    public static int[][] matrixManipu(int x, int y) {
        int returnMatrix[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    returnMatrix[i][j] = 1;
                } else {
                    returnMatrix[i][j] = 0;
                }
            }
        }
        return returnMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixManipu(10, 2)));
        // [[1, 0], [0, 1], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0]]
        System.out.println(Arrays.deepToString(matrixManipu(10, 4)));
        // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1], [0, 0, 0, 0], [0, 0, 0, 0], [0,
        // 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
        System.out.println(Arrays.deepToString(matrixManipu(10, 6)));
        // [[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0,
        // 0, 0, 1, 0], [0, 0, 0, 0, 0, 1], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0,
        // 0], [0, 0, 0, 0, 0, 0]]
        System.out.println(Arrays.deepToString(matrixManipu(10, 8)));
        // [[1, 0, 0, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0, 0, 0], [0, 0, 0,
        // 1, 0, 0, 0, 0], [0, 0, 0, 0, 1, 0, 0, 0], [0, 0, 0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 0, 0, 1,
        // 0], [0, 0, 0, 0, 0, 0, 0, 1], [0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0]]
        System.out.println(Arrays.deepToString(matrixManipu(10, 10)));
        // [[1, 0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0, 0, 0,
        // 0, 0], [0, 0, 0, 1, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 1, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 1,
        // 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 1, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 1, 0, 0], [0, 0, 0, 0,
        // 0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 1]]
    }

}
