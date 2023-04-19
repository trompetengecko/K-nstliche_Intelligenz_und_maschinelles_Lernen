import java.util.Arrays;

public class BonusScalarScale1 {

    // Schreiben Sie eine Methode, die ein Skalar x (vom Typ Integer) als Parameter erwartet und ein
    // Skalar (vom Typ Double) zurückgibt. Der Skalar x soll dabei durch eine Skalierung mit dem
    // gegebenen Faktor 42. transformiert werden.

    public static double scalarScale1(int x) {
        return (double) x * 42;
    }

    public static void main(String[] args) {


        System.out.println(scalarScale1(-2));
        // -84.0
        System.out.println(scalarScale1(-1));
        // -42.0
        System.out.println(scalarScale1(0));
        // 0.0
        System.out.println(scalarScale1(+1));
        // 42.0
        System.out.println(scalarScale1(+2));
        // 84.0
    }

}
