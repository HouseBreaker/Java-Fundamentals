package p01_Geometry.Abstract;

import p01_Geometry.Vertices.Vertex;

public abstract class Shape {
	protected Vertex[] coordinates;

	protected Shape() {
	}

	public Vertex[] getCoordinates() {
		return coordinates;
	}

	protected String getClassName() {
		String fullClassName = this.getClass().toString();
		int indexOfLastDot = fullClassName.lastIndexOf('.');

		return fullClassName.substring(indexOfLastDot + 1, fullClassName.length());
	}
}
