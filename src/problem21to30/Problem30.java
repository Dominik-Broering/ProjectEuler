package problem21to30;

public class Problem30 {
	
	/*
	 * 	Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

		1634 = 14 + 64 + 34 + 44
		8208 = 84 + 24 + 04 + 84
		9474 = 94 + 44 + 74 + 44
		As 1 = 14 is not a sum it is not included.

		The sum of these numbers is 1634 + 8208 + 9474 = 19316.
		
		Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
	 */
	
	public long run(){
		long result = 0;
		for(int i = 2; i<355000; i++){
			char[] num = String.valueOf(i).toCharArray();
			if(i == getToPowerFive(num)){
				System.out.println("i: "+i+" 5char: "+getToPowerFive(num));
				result = result + i;
			}
		}
		return result;
	}
	
	public long getToPowerFive(char[] num){
		long result = 0;
		int temp;
		for(int i = 0; i<num.length; i++){
			temp = Character.getNumericValue(num[i]);
			result = result + (int)Math.pow(temp, 5);
		}
		return result;
	}
}
