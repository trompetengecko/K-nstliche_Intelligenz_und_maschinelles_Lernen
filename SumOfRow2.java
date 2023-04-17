public class SumOfRow2 {

    // Erstellen Sie eine Funktion 'sumOfRow2', welche die Summe der zweiten Zeile
    // eines 2D-Arrays 'x' zurückliefert. Prüfen Sie vorher ob diese existiert,
    // falls nicht: 0 zurückgeben.

    public static double sumOfRow2(double[][] x) {
        double sumAggregat = 0;
        if (x.length > 1) {
            for (int i = 0; i < x[1].length; i++) {
                sumAggregat += x[1][i];
            }
        }

        return sumAggregat;
    }

    public static void main(String[] args) {
        System.out.println(sumOfRow2(new double[][] {}));
        // 0.0
        System.out.println(sumOfRow2(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
        // 6.0
    }

}