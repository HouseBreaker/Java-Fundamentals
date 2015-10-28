package p01_Geometry.Figures3D;

import p01_Geometry.Abstract.SpaceShape;
import p01_Geometry.Vertices.Vertex3D;

public class Cuboid extends SpaceShape {
	private Vertex3D position;
	private double width, height, depth;

	public Cuboid(double x, double y, double z, double width, double height, double depth) {
		super(new Vertex3D[]{new Vertex3D(x, y, z)});

		this.setPosition(new Vertex3D(x, y, z));
		this.setWidth(width);
		this.setHeight(height);
		this.setDepth(depth);
	}

	public Vertex3D getPosition() {
		return position;
	}

	public void setPosition(Vertex3D position) {
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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	@Override
	public double getArea() {
		return (getWidth() * getDepth() +
				getWidth() * getHeight() +
				getHeight() * getDepth());
	}

	@Override
	public double getVolume() {
		return getWidth() * getHeight() * getDepth();
	}
}
