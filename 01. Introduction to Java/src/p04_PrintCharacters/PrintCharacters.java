package p04_PrintCharacters;

public class PrintCharacters {
    public static void main(String[] args){

        System.out.println("\nProblem 4: Print Characters:");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch != 'z') {
                System.out.print(ch + " ");
            }
            else{
                System.out.println(ch);
            }
        }
    }
}

