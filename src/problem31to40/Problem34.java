package problem31to40;

import java.math.BigInteger;

public class Problem34 {
	
	/*
	 * 	145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
     *
	 *	Find the sum of all numbers which are equal to the sum of the factorial of their digits.
	 *
	 *	Note: as 1! = 1 and 2! = 2 are not sums they are not included.
	 */
	
	private int max;
	
	public BigInteger run(){
		BigInteger result = BigInteger.valueOf(0);
		BigInteger temp;
		for(int i = 3; i<2540161; i++){
			temp = getFactorialSum(i);
			if(BigInteger.valueOf(i).compareTo(temp) == 0){
				System.out.println("Succes: "+i);
				result = result.add(BigInteger.valueOf(i));
			}
			if(i % 1000 == 0){
				System.out.println("i: "+i+" temp: "+temp);
			}
		}
		return result;
	}
	
	public BigInteger getFactorialSum(int num){
		char[] numArr = String.valueOf(num).toCharArray();
		int[] temp = new int[numArr.length];
		for(int i = 0; i<temp.length; i++){
			temp[i] = Character.getNumericValue(numArr[i]);
		}
		
		BigInteger result = BigInteger.valueOf(0);
		BigInteger temp2;
		for(int i = 0; i<temp.length; i++){
			temp2 = BigInteger.valueOf(temp[i]);
			if(temp[i] == 0){
				temp2 = BigInteger.valueOf(1);
			}
			for(int r = temp[i]-1; r>0; r--){
				temp2 = temp2.multiply(BigInteger.valueOf(r));
			}
			result = result.add(temp2);
			if(BigInteger.valueOf(num).compareTo(result) < 0){
				return result;
			}
		}
		
		return result;
	}
}
