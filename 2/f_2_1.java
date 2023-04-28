import java.util.Arrays;

public class f_2_1 {

    // Implementieren Sie eine Modellfunktion f(x) als Vektor-Vektor-Funktion. Sie soll einen
    // Java-Vektor vom Typ double übergeben bekommen (Länge 2) und die Klasse als Java-Vektor der
    // Länge 3 im One-Hot-Format zurückgeben. Die zurückgelieferte Klasse soll sets 1 sein.

    public static double[] f(double[] x) {
        double returnVector[] = {1.0, 0.0, 0.0};
        return returnVector;
    }

    public static void printArray(double[] x) {
        if (x.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < x.length - 1; i++) {
            System.out.print(x[i] + ",");
        }
        System.out.println(x[x.length - 1] + "]");
    }


    public static void main(String[] args) {
        printArray(f(new double[] {0.0, 1.0}));
        // [1.0,0.0,0.0]
        printArray(f(new double[] {0.0, 0.0}));
        // [1.0,0.0,0.0]
        printArray(f(new double[] {2.0, 0.0}));
        // [1.0,0.0,0.0]
        printArray(f(new double[] {2.0, 2.0}));
        // [1.0,0.0,0.0]
    }

}
