import java.util.Scanner;

// this was in the pdf and I did it without realizing it wasn't part of the actual homework. Oops.

public class p03_PointsInsideAFigure_PDFHomework {

	static int numberOfRectangles = 3;
	static double[][][] figures = new double[numberOfRectangles][2][2];
	// first dimension is the figure, 2nd is its top left point, 3rd is its bottom right point

	public static void main() {
		System.out.println("\nProblem 3. Points inside a Figure");

		System.out.print("Please input 2 coordinates separated by a space: ");

		//make some rectangles
		figures[0][0] = new double[]{12.5, 8.5};
		figures[0][1] = new double[]{17.5, 13.5};

		figures[1][0] = new double[]{12.5, 6.0};
		figures[1][1] = new double[]{22.5, 8.5};

		figures[2][0] = new double[]{20, 8.5};
		figures[2][1] = new double[]{22.5, 13.5};

		Scanner in = new Scanner(System.in);

		double x = in.nextDouble(), y = in.nextDouble();

		print(x, y);
	}

	private static void print(double x, double y) {
		for (int rectangle = 0; rectangle < numberOfRectangles; rectangle++) {
			boolean inside = checkIfInside(x, y, rectangle);

			if (inside) {
				System.out.println("Inside");
				return;
			}
		}
		System.out.println("Outside");
	}

	private static boolean checkIfInside(double x, double y, int rectangle) {

		if (x >= figures[rectangle][0][0] && x <= figures[rectangle][1][0]) {
			if (y >= figures[rectangle][0][1] && y <= figures[rectangle][1][1]) {
				return true;
			}
		}
		return false;
	}
}
