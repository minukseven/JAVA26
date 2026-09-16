package circle;

public class Clrcle {
    final static double PI = 3.14;
    protected double radius;

    public Clrcle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
    
    
}