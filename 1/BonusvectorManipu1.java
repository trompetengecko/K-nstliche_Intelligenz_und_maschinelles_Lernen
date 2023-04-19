import java.util.Arrays;

public class BonusvectorManipu1 {

    // Schreiben Sie eine Methode, die ein Skalar x (vom Typ Integer) sowie ein Skalar y (vom Typ
    // Integer) als Parameter erwartet und ein Vektor (vom Typ Double) zurückgibt. Der Vektor soll
    // die Länge von x besitzen und lediglich an der Stelle y den Wert 1. aufweisen; alle weiteren
    // Elemente sind mit dem Wert 0. zu belegen.

    public static double[] vectorManipu(int x, int y) {
        double returnVector[] = new double[x];
        for (int i = 0; i < x; i++) {
            if (i == y) {
                returnVector[i] = 1;
            } else {
                returnVector[i] = 0;
            }
        }
        return returnVector;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(vectorManipu(10, 2)));
        // [0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(vectorManipu(10, 4)));
        // [0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(vectorManipu(10, 6)));
        // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(vectorManipu(10, 8)));
        // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0]
        System.out.println(Arrays.toString(vectorManipu(10, 10)));
        // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
    }

}
