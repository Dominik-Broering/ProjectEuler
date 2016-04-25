package problem11to20;

import java.math.BigInteger;

public class Problem20 {
	
	/*
	 * 	n! means n × (n - 1) × ... × 3 × 2 × 1
	 *
	 *	For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
	 *	and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 	 *
	 *	Find the sum of the digits in the number 100!
	 */
	
	public int run(int n){
		BigInteger result = BigInteger.valueOf(n);
		int sum = 0;
		for(int i = n-1; i>0; i--){
			result = result.multiply(BigInteger.valueOf(i));
		}
		char[] resultArr = result.toString().toCharArray();
		for(int i = 0; i<resultArr.length; i++){
			sum = sum + Character.getNumericValue(resultArr[i]);
		}
		return sum;
	}
}
