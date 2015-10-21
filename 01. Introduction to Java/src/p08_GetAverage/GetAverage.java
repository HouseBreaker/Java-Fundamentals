package p08_GetAverage;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args){
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
    
        for (double a : abc) {
            sum += a;
        }

        return sum/abc.length;
    }
}
