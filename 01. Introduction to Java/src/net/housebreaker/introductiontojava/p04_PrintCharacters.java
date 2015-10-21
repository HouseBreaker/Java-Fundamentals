public class p04_PrintCharacters {
    public static void main(){

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

