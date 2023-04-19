import java.util.Arrays;

public class BonusSumOfColOne {

    // Erstellen Sie eine Matrix-Skalar-Methode 'sumOfColOne', welche die Summe der zweiten Spalte
    // einer Matrix berechnet und als Double zurückgibt. Prüfen Sie vorher ob diese existiert, falls
    // nicht geben Sie den Wert 0. zurück.


    public static double sumOfColOne(double x[][]) {
        double returnSkalar = 0;
        if (x[0].length > 1) {

            for (int i = 0; i < x.length; i++) {
                returnSkalar += x[i][1];
            }
        }
        return returnSkalar;
    }

    public static void main(String[] args) {
        System.out.println(sumOfColOne(
                new double[][] {{0, +1, -2}, {+3, -4, +5}, {-6, +7, -8}, {+9, -10, +11}}));
        // -6.0
        System.out.println(sumOfColOne(
                new double[][] {{0, -1, +2}, {-3, +4, -5}, {+6, -7, +8}, {-9, +10, -11}}));
        // 6.0
        System.out.println(sumOfColOne(new double[][] {{-2, -1, 0}, {-1, 0, +1}, {0, +1, +2}}));
        // 0.0
        System.out.println(sumOfColOne(
                new double[][] {{-9, -4, -6}, {-1, -5, -3}, {-7, -2, -9}, {-8, -3, -4}}));
        // -14.0
        System.out.println(sumOfColOne(
                new double[][] {{+9, +4, +6}, {+1, +5, +3}, {+7, +2, +9}, {+8, +3, +4}}));
        // 14.0

    }

}
