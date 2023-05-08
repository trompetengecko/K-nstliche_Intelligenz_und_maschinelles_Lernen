import java.util.Arrays;

public class KI_3_3_toOneHot {

        // Erstellen Sie eine Funktion 'toOneHot', welche einen int-Parameter 'x' und einen weiteren
        // int-Parameter 'length' erwartet (sie können annehmen dass gilt: 0 <= x < length), und ein
        // Array der Länge 'length' zurückliefert. Dieses Array soll die Klasse x im one-hot Format
        // codieren.

        public static double[] toOneHot(int x, int length) {


                double returnVector[] = new double[length];
                returnVector[x] = 1;
                return returnVector;
        }



        public static void main(String[] args) {
                System.out.println(java.util.Arrays.toString(toOneHot(1, 2)));
                // [0.0, 1.0]
                System.out.println(java.util.Arrays.toString(toOneHot(0, 2)));
                // [1.0, 0.0]
        }

}
