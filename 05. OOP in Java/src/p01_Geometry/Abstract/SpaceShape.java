package p01_Geometry.Abstract;

import p01_Geometry.Interfaces.AreaMeasurable;
import p01_Geometry.Interfaces.VolumeMeasurable;
import p01_Geometry.Vertices.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

	public SpaceShape(Vertex3D[] coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return String.format(
				"Shape Type: %s\r\n\t" +
						"Area: %.2f\r\n\t" +
						"Volume: %.2f\r\n",
				this.getClassName(),
				this.getArea(),
				this.getVolume());
	}
}
