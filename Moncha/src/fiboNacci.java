
public class fiboNacci {

	public static void main(String[] args) {

	        System.out.println(sumEvenFib(50, 500));

	}
    public static int sumEvenFib(int start, int end) {
    	int prevo = 1; //previous number
        int n = 2; //We start with 2 since we are trying to find the even number of the Fibonacci
        int total = 2;
        
        while (total < end && total + n < end) {
            int tempo = n;
            n = prevo + tempo;
            prevo = tempo;
            
            if (n % 2 == 0){
                total += n;
            }
            
        }
        return total;
    }
}

