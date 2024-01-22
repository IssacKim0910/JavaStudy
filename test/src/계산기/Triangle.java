package 계산기;

public class Triangle implements Figure{
	
	private double width;
	private double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	public double calArea() {
		return width * height / 2;
	}
		
	

	
	
}
