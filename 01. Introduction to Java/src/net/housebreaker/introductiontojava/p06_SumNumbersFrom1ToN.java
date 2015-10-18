package net.housebreaker.introductiontojava;
import java.util.Scanner;

public class p06_SumNumbersFrom1ToN {
    public static void main(){
        System.out.println("\nProblem 6: Sum Numbers from 1 to N:");

        System.out.print("Please enter a number: ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum+=i;
        }

        System.out.printf("The sum of the numbers from 1 to %d is %d", number, sum);
    }
}
