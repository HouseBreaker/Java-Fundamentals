package p07_GhettoNumeralSystem;

import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args){
        System.out.println("\nProblem 7: Ghetto Numeral System:"); // disgust

        String[] numbers = new String[] {"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};

        System.out.print("Please enter a number: ");

        Scanner in = new Scanner(System.in);
        String number = String.valueOf(in.nextInt());
        int numberLength = number.length();

        for (int i = 0; i < numberLength; i++) {
            int ghettoNumber = (number.charAt(i) - '0');
            System.out.print(numbers[ghettoNumber]);
        }
    }
}
