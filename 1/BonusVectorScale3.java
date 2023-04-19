import java.util.Arrays;

public class BonusVectorScale3 {

    // Erstellen Sie eine Matrix-Skalar-Methode 'sumOfRowTwo', welche die Summe der dritten Zeile
    // einer Matrix als Double zurückgibt. Prüfen Sie vorher ob diese existiert, falls nicht geben
    // Sie den Wert 0. zurück.

    public static double sumOfRowTwo(double x[][]) {
        double returnSkalarSum = 0;
        if (x.length > 2) {
            for (int i = 0; i < x[2].length; i++) {
                returnSkalarSum += x[2][i];
            }
        }
        return returnSkalarSum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfRowTwo(
                new double[][] {{0, +1, -2}, {+3, -4, +5}, {-6, +7, -8}, {+9, -10, +11}}));
        // -7.0
        System.out.println(sumOfRowTwo(
                new double[][] {{0, -1, +2}, {-3, +4, -5}, {+6, -7, +8}, {-9, +10, -11}}));
        // 7.0
        System.out.println(sumOfRowTwo(new double[][] {{-2, -1, 0}, {-1, 0, +1}, {0, +1, +2}}));
        // 3.0
        System.out.println(sumOfRowTwo(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}}));
        // -18.0
        System.out.println(sumOfRowTwo(
                new double[][] {{+9, +4, +6}, {+1, +5, +3}, {+7, +2, +9}, {+8, +3, +4}}));
        // 18.0
    }

}
