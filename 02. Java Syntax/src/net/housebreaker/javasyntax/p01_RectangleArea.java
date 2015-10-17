package net.housebreaker.javasyntax;

import java.util.Scanner;

public class p01_RectangleArea {
    public static void main() {
        System.out.println("\nProblem 1. Rectangle Area");

        System.out.print("Please input 2 integers separated by a space: ");
        Scanner in = new Scanner(System.in);

        int width = in.nextInt(), height = in.nextInt();
        int area = width * height;

        System.out.println("Area = " + area);
    }
}
