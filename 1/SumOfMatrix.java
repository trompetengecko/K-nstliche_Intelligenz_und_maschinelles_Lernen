public class SumOfMatrix {

    // Erstellen Sie eine Matrix-Vektor-Funktion 'sumOfMatrix', welche die Summe
    // aller Einträge eines 2D-Arrays berechnet.

    public static double sumOfMatrix(double[][] x) {
        double sumAggregat = 0;
        if (x.length > 0) {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i].length; j++) {
                    sumAggregat += x[i][j];
                }
            }
        }
        return sumAggregat;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMatrix(new double[][] {}));
        // 0.0
        System.out.println(sumOfMatrix(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
        // 18.0
    }

}