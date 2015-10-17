package net.housebreaker.javasyntax;

import java.util.Scanner;

public class p02_TriangleArea {
    public static void main(){
        System.out.println("\nProblem 2. Triangle Area");

        System.out.print("Please input the 3 coordinates separated by a space: ");

        Scanner in = new Scanner(System.in);

        int[] A = new int[] {in.nextInt(), in.nextInt()};
        int[] B = new int[] {in.nextInt(), in.nextInt()};
        int[] C = new int[] {in.nextInt(), in.nextInt()};

        int area = Math.abs((A[0]*(B[1]-C[1]) + B[0]*(C[1]-A[1]) + C[0]*(A[1]-B[1])))/2;

        System.out.println("Area of triangle = " + area);
    }
}
