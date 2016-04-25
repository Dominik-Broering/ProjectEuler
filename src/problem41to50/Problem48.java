package problem41to50;

import java.math.BigInteger;

public class Problem48 {
	
	/*
	 * 	The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
	 *
	 *	Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
	 */
	
	public String run(){
		BigInteger result = BigInteger.valueOf(0);
		BigInteger temp;
		for(int i = 1; i<=1000; i++){
			temp = BigInteger.valueOf(i);
			temp = temp.pow(i);
			result = result.add(temp);
			if(i % 50 == 0){
				System.out.println("i: "+i+" temp: "+temp+" result: "+result);
			}
		}
		String num = result.toString();
		num = num.substring(num.length()-10);
		return num;
	}
}
