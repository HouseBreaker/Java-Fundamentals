package p16_RecursiveFactorial;

public class RecursiveFactorial {
	public static void main(String[] args) {
		System.out.println(Factorial(39)); // 39 is the biggest factorial that long can store.
	}
	
	private static long Factorial(long number) {
		
		if (number == 0)
		{
			return 1;
		}
		return number * Factorial(number-1);
	}
}
