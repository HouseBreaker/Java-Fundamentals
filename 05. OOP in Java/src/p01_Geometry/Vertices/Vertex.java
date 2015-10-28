package p01_Geometry.Vertices;

public class Vertex {
	protected double x;
	protected double y;

	protected Vertex(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public static double getDistanceBetweenPoints(Vertex... vertices) {
		double accumulatePointSum = 0;

		for (int i = 1; i < vertices.length; i++) {
			double differenceBetweenTwoPoints =
					Math.pow(vertices[i].getX() - vertices[i - 1].getX(), 2) +
							Math.pow(vertices[i].getY() - vertices[i - 1].getY(), 2);

			accumulatePointSum += differenceBetweenTwoPoints;
		}

		return Math.sqrt(accumulatePointSum);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
