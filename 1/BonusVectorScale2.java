import java.util.Arrays;

public class BonusVectorScale2 {

    // Schreiben Sie eine Methode, die einen Vektor x (vom Typ Integer) als Parameter erwartet und
    // ein Vektor (vom Typ Double) zurückgibt.
    // Der Vektor x soll dabei durch eine Skalierung mit dem gegebenen Divisor 24. transformiert
    // werden.

    public static double[] vectorScale2(int x[]) {
        double[] returnVector = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            returnVector[i] = (double) x[i] / 24;
        }
        return returnVector;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(vectorScale2(new int[] {-1, -2, -4, -8, -16})));
        // [-0.041666666666666664, -0.08333333333333333, -0.16666666666666666, -0.3333333333333333,
        // -0.6666666666666666]
        System.out.println(Arrays.toString(vectorScale2(new int[] {-2, -3, -5, -7, -11})));
        // [-0.08333333333333333, -0.125, -0.20833333333333334, -0.2916666666666667,
        // -0.4583333333333333]
        System.out.println(Arrays.toString(vectorScale2(new int[] {1, -1, 2, -3, 5})));
        // [0.041666666666666664, -0.041666666666666664, 0.08333333333333333, -0.125,
        // 0.20833333333333334]
        System.out.println(Arrays.toString(vectorScale2(new int[] {2, 3, 5, 7, 11})));
        // [0.08333333333333333, 0.125, 0.20833333333333334, 0.2916666666666667, 0.4583333333333333]
        System.out.println(Arrays.toString(vectorScale2(new int[] {1, 2, 4, 8, 16})));
        // [0.041666666666666664, 0.08333333333333333, 0.16666666666666666, 0.3333333333333333,
        // 0.6666666666666666]
    }

}
