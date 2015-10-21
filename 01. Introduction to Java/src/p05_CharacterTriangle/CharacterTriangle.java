package p05_CharacterTriangle;

import java.util.Scanner;

public class CharacterTriangle {
    public static void main(String[] args){
        System.out.println("\nProblem 5: Character Triangle:");

        System.out.print("Please enter a number from 1 to 26: ");

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('a' + j) + " ");
            }
            System.out.println();
        }

        for (int i = length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('a' + j) + " ");
            }
            System.out.println();
        }
    }

}
