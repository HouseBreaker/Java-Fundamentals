package net.housebreaker.javasyntax;

import java.util.Scanner;

public class p06_ConvertFromBase7ToDec {
    public static void main() {
        System.out.println("\nProblem 5. Convert from Base 7 to base 10");
        System.out.print("Please enter a number to convert to base 10: ");

        Scanner in = new Scanner(System.in);

        String base7 = in.nextLine();
        String base10 = Integer.toString(Integer.parseInt(base7, 7), 10);

        System.out.println(base7 + " in base 7 is " + base10 + " in base 10");
    }
}
