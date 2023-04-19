import java.util.Arrays;

public class BonusVectorScale1 {

    // Schreiben Sie eine Methode, die einen Vektor x (vom Typ Integer) als Parameter erwartet und
    // ein Vektor (vom Typ Double) zurückgibt. Der Vektor x soll dabei durch eine Skalierung mit dem
    // gegebenen Faktor 42. transformiert werden.

    public static double[] vectorScale1(int x[]) {
        double returnVector[] = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            returnVector[i] = (double) x[i] * 42;
        }
        return returnVector;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(vectorScale1(new int[] {-1, -2, -4, -8, -16})));
        // [-42.0, -84.0, -168.0, -336.0, -672.0]
        System.out.println(Arrays.toString(vectorScale1(new int[] {-2, -3, -5, -7, -11})));
        // [-84.0, -126.0, -210.0, -294.0, -462.0]
        System.out.println(Arrays.toString(vectorScale1(new int[] {1, -1, 2, -3, 5})));
        // [42.0, -42.0, 84.0, -126.0, 210.0]
        System.out.println(Arrays.toString(vectorScale1(new int[] {2, 3, 5, 7, 11})));
        // [84.0, 126.0, 210.0, 294.0, 462.0]
        System.out.println(Arrays.toString(vectorScale1(new int[] {1, 2, 4, 8, 16})));
        // [42.0, 84.0, 168.0, 336.0, 672.0]
    }

}
