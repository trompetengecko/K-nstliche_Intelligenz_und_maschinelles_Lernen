public class SumOfColOne {

    // Erstellen Sie eine Matrix-Skalar-Funktion 'sumOfColOne', welche die Summe der
    // zweiten Spalte einer Matrix zurückgibt. Sie können davon ausgehen dass diese
    // existiert sofern die Matrix mindesten eine Zeile hat.

    public static double sumOfColOne(double[][] x) {
        double sumAggregat = 0;
        if (x.length > 0) {
            for (int i = 0; i < x.length; i++) {
                sumAggregat += x[i][1];
            }
        }

        return sumAggregat;
    }

    public static void main(String[] args) {
        System.out.println(sumOfColOne(new double[][] {}));
        // 0.0
        System.out.println(sumOfColOne(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
        // 6.0
    }

}