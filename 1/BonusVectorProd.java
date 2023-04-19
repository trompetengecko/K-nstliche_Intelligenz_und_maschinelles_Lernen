import java.util.Arrays;

public class BonusVectorProd {

    // Schreiben Sie eine Methode, die einen Vektor x (vom Typ Double) als Parameter erwartet und
    // ein Skalar (vom Typ Double) zurückgibt. Bilden Sie dazu das Produkt über x.

    public static double vectorProd(double x[]) {
        double prodAggregat = 1;
        for (int i = 0; i < x.length; i++) {
            prodAggregat *= x[i];
        }
        return prodAggregat;
    }

    public static void main(String[] args) {
        System.out.println(vectorProd(new double[] {-1, -2, -4, -8, -16}));
        // -1024.0
        System.out.println(vectorProd(new double[] {-2, -3, -5, -7, -11}));
        // -2310.0
        System.out.println(vectorProd(new double[] {1, -1, 2, -3, 5}));
        // 30.0
        System.out.println(vectorProd(new double[] {2, 3, 5, 7, 11}));
        // 2310.0
        System.out.println(vectorProd(new double[] {1, 2, 4, 8, 16}));
        // 1024.0
    }

}
