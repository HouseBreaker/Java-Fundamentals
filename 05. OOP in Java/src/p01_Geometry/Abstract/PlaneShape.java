package p01_Geometry.Abstract;

import p01_Geometry.Interfaces.AreaMeasurable;
import p01_Geometry.Interfaces.PerimeterMeasurable;
import p01_Geometry.Vertices.Vertex2D;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

	public PlaneShape(Vertex2D[] vertices) {
		this.coordinates = vertices;
	}

	@Override
	public String toString() {
		return String.format(
				"Shape Type: %s\r\n\t" +
						"Area: %.2f\r\n\t" +
						"Perimeter: %.2f\r\n",
				this.getClassName(),
				this.getArea(),
				this.getPerimeter());
	}
}