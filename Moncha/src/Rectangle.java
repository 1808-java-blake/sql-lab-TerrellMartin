
public class Rectangle {
	float width;
	float height;
	
	Rectangle(float width, float height){
		this.width = width;
		this.height = height;
	}
	int getarea() {
		if (width < 0 || width >= 20) {
			System.out.println(" the width must be under 20 and greater than 0.");
			return 0;
		}
		if (height < 0 || height >= 20) {
			System.out.println("The length must be under 20 and greater than 0.");
			return 0;
		}
		return (int) Math.ceil(width * height);
	}

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10.0f, 10.0f);
		System.out.println(rec1.getarea());

	}

}
