public class SumOfSquares {

    // Erstellen Sie eine Vektor-Skalar-Methode 'sumOfSquares', die die Summe der
    // Quadrate der einzelnen Elemente eines Vektors zurückliefert.

    public static double sumOfSquares(double[] x) {
        double sumAggregat = 0;
        for (int i = 0; i < x.length; i++) {
            sumAggregat = sumAggregat + Math.pow(x[i], 2);
        }

        return sumAggregat;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(new double[] { 1., 1., 1. }));
        // 3.0
        System.out.println(sumOfSquares(new double[] { 1., 2., 3. }));
        // 14.0
    }

}