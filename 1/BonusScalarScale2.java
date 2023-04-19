import java.util.Arrays;

public class BonusScalarScale2 {

    // Schreiben Sie eine Methode, die ein Skalar x (vom Typ Integer) als Parameter erwartet und ein
    // Skalar (vom Typ Double) zurückgibt. Der Skalar x soll dabei durch eine Skalierung mit dem
    // gegebenen Divisor 24. transformiert werden.

    public static double scalarScale2(int x) {
        return (double) x / 24;
    }

    public static void main(String[] args) {

        System.out.println(scalarScale2(-2));
        // -0.08333333333333333
        System.out.println(scalarScale2(-1));
        // -0.041666666666666664
        System.out.println(scalarScale2(0));
        // 0.0
        System.out.println(scalarScale2(+1));
        // 0.041666666666666664
        System.out.println(scalarScale2(+2));
        // 0.08333333333333333
    }

}
