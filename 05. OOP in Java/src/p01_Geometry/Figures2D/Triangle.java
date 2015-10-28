package p01_Geometry.Figures2D;

import p01_Geometry.Abstract.PlaneShape;
import p01_Geometry.Vertices.Vertex;
import p01_Geometry.Vertices.Vertex2D;

public class Triangle extends PlaneShape {
	private Vertex2D a, b, c;

	public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
		super(new Vertex2D[]{
				new Vertex2D(aX, aY),
				new Vertex2D(bX, bY),
				new Vertex2D(cX, cY)
		});

		this.setA(new Vertex2D(aX, aY));
		this.setB(new Vertex2D(bX, bY));
		this.setC(new Vertex2D(cX, cY));
	}

	public Vertex2D getA() {
		return a;
	}

	public void setA(Vertex2D a) {
		this.a = a;
	}

	public Vertex2D getB() {
		return b;
	}

	public void setB(Vertex2D b) {
		this.b = b;
	}

	public Vertex2D getC() {
		return c;
	}

	public void setC(Vertex2D c) {
		this.c = c;
	}


	@Override
	public double getArea() {
		double p = getPerimeter() / 2;

		double a = Vertex.getDistanceBetweenPoints(getA(), getB());
		double b = Vertex.getDistanceBetweenPoints(getB(), getC());
		double c = Vertex.getDistanceBetweenPoints(getA(), getC());

		double area = p * (p - a) * (p - b) * (p - c);
		return Math.sqrt(area);
	}

	@Override
	public double getPerimeter() {
		double a = Vertex.getDistanceBetweenPoints(getA(), getB());
		double b = Vertex.getDistanceBetweenPoints(getB(), getC());
		double c = Vertex.getDistanceBetweenPoints(getA(), getC());

		return a + b + c;
	}
}
