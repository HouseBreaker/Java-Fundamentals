package p01_Geometry.Figures2D;

import p01_Geometry.Abstract.PlaneShape;
import p01_Geometry.Vertices.Vertex2D;

public class Rectangle extends PlaneShape {
	private Vertex2D position;
	private double width, height;

	public Rectangle(double x, double y, double width, double height) {
		super(new Vertex2D[]{new Vertex2D(x, y)});

		this.setPosition(new Vertex2D(x, y));
		this.setWidth(width);
		this.setHeight(height);
	}

	public Vertex2D getPosition() {
		return position;
	}

	public void setPosition(Vertex2D position) {
		this.position = position;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}

	@Override
	public double getPerimeter() {
		return 2 * (getWidth() + getHeight());
	}

}
