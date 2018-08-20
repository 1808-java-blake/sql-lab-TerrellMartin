
public class Square {
	float width;
	
	Square (float width){
		this.width = width;
	}
	int getArea () {
		if (width < 0 || width >= 20) {
			System.out.println("the width must be lower than 20 and greater than 0.");
			return 0;
		}
		return (int) Math.ceil((width * width));
	}

	public static void main(String[] args) {
		Square sq1 = new Square(5);
		System.out.println(sq1.getArea());

	}

}
