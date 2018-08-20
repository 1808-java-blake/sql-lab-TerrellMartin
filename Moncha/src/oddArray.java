
public class oddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 0;
		int r = 50; //let l be the minimum integer and let r be the maximum integer.
		int[] odd = new int[r];
		int loop = r/2;
		
		for(int i = l; i < loop; i++) {
			odd[i] = 2 * i + 1;
		}
		
		//Now we must print out the odd number in the elements of the Array
		for (int j = l; j < loop; j++) {
			System.out.println(odd[j] + " ");
		}
	}
}