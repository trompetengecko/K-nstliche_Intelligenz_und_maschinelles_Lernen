import java.util.Arrays;

public class ModelExample3 {

    // Schreiben Sie eine Methode, die ein 2D-double-Array x als Parameter erwartet
    // und ein 2D-double-Array mit genauso vielen Spalten aber nur einer Zeile
    // zurückgibt. Jedes Zeilenelement soll die Summe der zugehörigen Spalte von x
    // enthalten. Sie können davon ausgehen dass das Array mindestens eine Zeile
    // enthält.

    public static double[][] modelExample(double[][] x) {
        double[][] twoD = new double[1][x[0].length];
        if (x[0].length > 0 && x.length > 0) {
            for (int i = 0; i < x[0].length; i++) {
                for (int j = 0; j < x.length; j++) {
                    twoD[0][i] += x[j][i];
                }
            }
        }
        return twoD;
    }

    public static void main(String[] args) {

    }

}