package p01_Geometry.Figures3D;

import p01_Geometry.Abstract.SpaceShape;
import p01_Geometry.Vertices.Vertex3D;

public class Sphere extends SpaceShape {
	private Vertex3D position;
	private double radius;

	public Sphere(double x, double y, double z, double radius) {
		super(new Vertex3D[]{new Vertex3D(x, y, z)});

		this.setPosition(new Vertex3D(x, y, z));
		this.setRadius(radius);
	}

	public Vertex3D getPosition() {
		return position;
	}

	public void setPosition(Vertex3D position) {
		this.position = position;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	public double getVolume() {
		return (4 / 3) * Math.PI * Math.pow(getRadius(), 3);
	}
}
