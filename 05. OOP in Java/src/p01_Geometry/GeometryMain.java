package p01_Geometry;

import p01_Geometry.Abstract.*;
import p01_Geometry.Figures2D.*;
import p01_Geometry.Figures3D.*;
import p01_Geometry.Interfaces.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GeometryMain {

	public static void main(String[] args) {
		Shape[] figures = new Shape[]{
				new Triangle(2.5, 3.5, 4.5, 2.5, 1.5, 3.5),
				new Rectangle(0, 1.5, 10, 20),
				new Circle(2.5, 1.5, 15),

				new Cuboid(4.5, 4.5, 1.3, 30, 20, 10),
				new Sphere(3, 2, 1, 20),
				new SquarePyramid(3, 4, 5, 20, 30)
		};

		for (Shape figure : figures) {
			System.out.println(figure);
		}

		List<Shape> largeVolumeShapes = Arrays.asList(figures)
				.stream()
				.filter(s -> s instanceof VolumeMeasurable)
				.filter(v -> ((VolumeMeasurable) v)
						.getVolume() > 40)
				.collect(Collectors.toList());

		System.out.println("Shapes with volume > 40:");
		largeVolumeShapes.forEach(System.out::println);

		Comparator<Shape> byPerimeter = (s1, s2) -> {
			PerimeterMeasurable Shape1 = (PerimeterMeasurable) s1;
			PerimeterMeasurable Shape2 = (PerimeterMeasurable) s2;
			double perimeterShape1 = Shape1.getPerimeter();
			double perimeterShape2 = Shape2.getPerimeter();

			return perimeterShape1 < perimeterShape2 ? -1 :
					perimeterShape1 > perimeterShape2 ? 1 : 0;
		};

		List<Shape> planeShapesByPerimeter = Arrays.asList(figures)
				.stream()
				.filter(p -> p instanceof PlaneShape)
				.sorted(byPerimeter)
				.collect(Collectors.toList());

		System.out.println("Planes sorted by perimeter");
		planeShapesByPerimeter.forEach(System.out::println);
	}
}
