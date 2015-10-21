import java.text.MessageFormat;
import java.util.Scanner;

public class p08_GetAverage {
    public static void main(){
        System.out.println("\nProblem 8: Get Average:");

        System.out.print("\nPlease enter 3 numbers separated by a space: ");

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        String[] abcString = input.split(" ");

        double[] abc = new double[abcString.length];
        for(int i = 0; i < abcString.length; i++) {
            abc[i] = Double.parseDouble(abcString[i]);
        }

        double average = getAverage(abc);

        System.out.printf("Average of %.2f, %.2f and %.2f is %.2f)", abc[0], abc[1], abc[2], average);
    }

    private static double getAverage(double[] abc) {
        double sum = 0;

        for (int i = 0; i < abc.length; i++) {
            sum+= abc[i];
        }

        return sum/abc.length;
    }
}
