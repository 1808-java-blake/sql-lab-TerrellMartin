
public class Circle {
	float radius;

	Circle (float radius){
		this.radius = radius;
	}
	
	int getArea() {
		if(radius < 0.0 ) {
			System.out.println("The radius is too low.");
			return 0;
		}
		if (radius >= 20.0) {
			System.out.println("The radius is too high.");
			return 0;
		}
		return (int) Math.ceil(3.14159265 * (radius * radius));

	}
		

	public static void main(String[] args) {
		Circle circle1 = new Circle(10.0f);
		System.out.println(circle1.getArea());
		


	}

}
