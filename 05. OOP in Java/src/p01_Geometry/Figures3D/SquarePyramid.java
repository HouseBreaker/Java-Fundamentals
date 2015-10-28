package p01_Geometry.Figures3D;

import p01_Geometry.Abstract.SpaceShape;
import p01_Geometry.Vertices.Vertex3D;

public class SquarePyramid extends SpaceShape {
	private Vertex3D baseCenter;
	private double baseWidth, height;

	public SquarePyramid(double baseCenterX, double baseCenterY, double baseCenterZ, double baseWidth, double height) {
		super(new Vertex3D[]{new Vertex3D(baseCenterX, baseCenterY, baseCenterZ)});

		this.setBaseCenter(new Vertex3D(baseCenterX, baseCenterY, baseCenterZ));
		this.setBaseWidth(baseWidth);
		this.setHeight(height);
	}

	public Vertex3D getBaseCenter() {
		return baseCenter;
	}

	public void setBaseCenter(Vertex3D baseCenter) {
		this.baseCenter = baseCenter;
	}

	public double getBaseWidth() {
		return baseWidth;
	}

	public void setBaseWidth(double baseWidth) {
		this.baseWidth = baseWidth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		double faceArea = (1.0 / 2.0) * (4 * getBaseWidth()) * getHeight();
		double baseArea = Math.pow(getBaseWidth(), 2);

		return faceArea + baseArea;
	}

	@Override
	public double getVolume() {
		return (1.0 / 3.0) * Math.pow(getBaseWidth(), 2) * getHeight();
	}
}
