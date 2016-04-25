package problem11to20;

import java.math.BigInteger;

public class Problem16 {
	
	/*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * 
	 * What is the sum of the digits of the number 2^1000?
	 */
	
	BigInteger num = BigInteger.valueOf(2);
	
	public BigInteger run(){
		BigInteger result = BigInteger.valueOf(0);
		num = num.pow(1000);
		String nums = num.toString();
		System.out.println(num);
		for(int i = 0; i<nums.length(); i++){
			result = result.add(BigInteger.valueOf(Character.getNumericValue(nums.charAt(i)))) ;
		}
		return result;
	}
}
