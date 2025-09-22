package prak4;

public class ComparableCircle extends Circle implements GeometricObject.Comparable {

	public ComparableCircle(double r, boolean a, String color) {
		super(r, a, color);
	}

	public ComparableCircle() {
		super();
	}

	public String ToString() {
		return super.ToString();
	}

	@Override
	public GeometricObject compareto(GeometricObject obj) {
		if (this.getArea() > obj.getArea())
			return this;
		else {
			return obj;
		}
	}
}
