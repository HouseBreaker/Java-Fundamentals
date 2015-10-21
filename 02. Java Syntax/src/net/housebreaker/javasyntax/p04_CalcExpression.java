import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class p04_CalcExpression {
	public static void main() {
		System.out.println("\nProblem 4. Calculate Expression");
		System.out.print("Please enter 3 float point numbers: ");

		Scanner in = new Scanner(System.in);

		double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();

		double formula1 = Math.pow(((a * a + b * b) / (a * a - b * b)), ((a + b + c) / Math.sqrt(c)));
		double formula2 = Math.pow(a * a + b * b - c * c * c, (a - b));

		double diff = average(new double[]{a, b, c}) - average(new double[]{formula1, formula2});
		diff = Math.abs(diff);
		System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formula1, formula2, diff);
	}

	private static double average(double[] nums) {
		double sum = DoubleStream.of(nums).sum();

		return sum / nums.length;
	}
}
