package prak4;

public abstract class GeometricObject {
	protected String color;
	protected boolean isFilled;

	public String getColor() {
		return this.color;
	}

	public boolean getIsFilled() {
		return this.isFilled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public abstract String ToString();

	public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
		if (obj1.getArea() > obj2.getArea()) {
			return obj1;
		} else {
			return obj2;
		}
	}

	public interface Comparable {
		public GeometricObject compareto(GeometricObject obj);
	};
}
