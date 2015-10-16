package net.housebreaker.introductiontojava;

import java.text.MessageFormat;
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

        System.out.println(MessageFormat.format("The sum of the numbers from 1 to {0} is {1}", number, sum));
    }
}
