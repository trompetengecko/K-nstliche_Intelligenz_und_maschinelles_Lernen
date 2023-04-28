import java.util.Arrays;

public class classError_2_5 {

    // Implementieren Sie die Klassifikationsfehler-Zielfunktion in einer Methode 'classError',
    // welche als Parameter ein 2D-Array Y und ein 2D-Array T erhält, welche die
    // Modellfunktionsoutputs sowie die Zielwerte eines Problems repräsentieren. Diese tut genau das
    // was die Methode classAccuracy aus der vorherigen Aufgabe auch tut, mit dem folgenden
    // Unterschied: sie berechnet die Zahl der inkorrekten Modelloutputs (anstelle der korrekten),
    // natürlich auch dividiert durch die Gesamtzahl der Beispiele. Wieder: was ist der Wertebereich
    // dieser Zielfunktion?

    public static double classError(double[][] Y, double[][] T) {
        double classError = 0;
        for (int i = 0; i < Y.length; i++) {
            double maxValueY = 0;
            double maxValueT = 0;
            double argMaxY = 0;
            double argMaxT = 0;
            for (int j = 0; j < Y[i].length; j++) {
                if (maxValueY < Y[i][j]) {
                    maxValueY = Y[i][j];
                    argMaxY = j;
                }
                if (maxValueT < T[i][j]) {
                    maxValueT = T[i][j];
                    argMaxT = j;
                }
            }
            if (argMaxY != argMaxT)
                classError++;
        }
        return classError / Y.length;
    }


    public static void main(String[] args) {
        double[][] T1 = new double[][] {{1., 0., 0.}, {0., 0., 1.}, {0., 1., 0.}};
        System.out.println(
                classError(new double[][] {{0.5, 0.4, 0.1}, {0.4, 0., 0.6}, {0., 0.9, 0.1}}, T1));
        // 0.0
        double[][] T2 = new double[][] {{1., 0., 0., 0.}, {0., 0., 1., 0.}, {0., 1., 0., 0.}};
        System.out.println(classError(
                new double[][] {{0.5, 0.4, 0.1, 0.}, {0.4, 0., 0.6, 0.}, {0., 0.9, 0.1, 0.}}, T2));
        // 0.0
        double[][] T3 = new double[][] {{1., 0., 0., 0.}, {0., 0., 1., 0.}, {0., 1., 0., 0.}};
        System.out.println(classError(
                new double[][] {{0.4, 0.5, 0.1, 0.}, {0.6, 0., 0.4, 0.}, {0., 0.1, 0.9, 0.}}, T3));
        // 1.0
        double[][] T4 = new double[][] {{1., 0.}, {0., 1.}, {0., 1.}, {1., 0.}};
        System.out.println(
                classError(new double[][] {{0.6, 0.4}, {0.4, 0.6}, {0.8, 0.2}, {0.3, 0.7}}, T4));
        // 0.5
        double[][] T5 = new double[][] {{1., 0.}, {0., 1.}, {0., 1.}, {1., 0.}};
        System.out.println(
                classError(new double[][] {{0.4, 0.6}, {0.6, 0.4}, {0.1, 0.9}, {0.7, 0.3}}, T5));
        // 0.5
    }

}
