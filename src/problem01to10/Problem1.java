package problem01to10;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
	
	int dividor1;
	int dividor2;
	int maxVal;
	
	public Problem1(int dividor1, int dividor2, int maxVal) {
		this.dividor1 = dividor1;
		this.dividor2 = dividor2;
		this.maxVal = maxVal;
	}
	
	public int run(){
		int result = 0;
		for(int i = 1; i<maxVal; i++){
			if(i % dividor1 == 0 || i % dividor2 == 0){
				result = result + i;
			}
		}
		return result;
	}
	
}
