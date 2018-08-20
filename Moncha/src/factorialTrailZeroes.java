
public class factorialTrailZeroes {

	public static void main(String[] args) {
		System.out.println(zeros(23));

	}
	public static int zeros (int n) {
		int t = 0; 
		
		for(int i = 5; n / i >= 1; i *= 5) {
			t += n / i;
		}
		return t;
		
	}

}
