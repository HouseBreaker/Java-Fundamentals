package p01_Geometry.Figures2D;

import p01_Geometry.Abstract.PlaneShape;
import p01_Geometry.Vertices.Vertex2D;

public class Circle extends PlaneShape {
	private double radius;
	private Vertex2D position;

	public Circle(double x, double y, double radius) {
		super(new Vertex2D[]{new Vertex2D(x, y)});

		this.setPosition(new Vertex2D(x, y));
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Vertex2D getPosition() {
		return position;
	}

	public void setPosition(Vertex2D position) {
		this.position = position;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}


}
