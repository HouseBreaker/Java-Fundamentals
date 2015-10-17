package net.housebreaker.javasyntax;

import java.util.Scanner;

public class p05_ConvertFromDecToBase7 {
    public static void main(){
        System.out.println("\nProblem 5. Convert from base 10 to base 7");
        System.out.print("Please enter a number to convert to base 7: ");

        Scanner in = new Scanner(System.in);

        String decimal = in.nextLine();
        String base7 = Integer.toString(Integer.parseInt(decimal, 10), 7);

        System.out.println(decimal + " in base 10 is " + base7 + " in base 7");
    }
}
