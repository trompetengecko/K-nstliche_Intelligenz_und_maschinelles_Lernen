import java.util.Arrays;

public class BonusVectorSum {

    // Schreiben Sie eine Methode, die einen Vektor x (vom Typ Double) als Parameter erwartet und
    // ein Skalar (vom Typ Double) zurückgibt. Bilden Sie dazu die Summe über x.



    public static double vectorSum(double x[]) {
        double returnSkalar = 0;
        for (int i = 0; i < x.length; i++) {
            returnSkalar += x[i];
        }

        return returnSkalar;
    }

    public static void main(String[] args) {

        System.out.println(vectorSum(new double[] {-1, -2, -4, -8, -16}));
        // -31.0
        System.out.println(vectorSum(new double[] {-2, -3, -5, -7, -11}));
        // -28.0
        System.out.println(vectorSum(new double[] {1, -1, 2, -3, 5}));
        // 4.0
        System.out.println(vectorSum(new double[] {2, 3, 5, 7, 11}));
        // 28.0
        System.out.println(vectorSum(new double[] {1, 2, 4, 8, 16}));
        // 31.0
    }

}
