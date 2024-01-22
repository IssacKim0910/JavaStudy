package 계산기;

public class Circle implements Figure {

	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double calArea() {
		return radius * radius * 3.14;
	}
}
