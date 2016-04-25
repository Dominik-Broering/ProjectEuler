package problem21to30;

import java.util.ArrayList;

public class Problem21 {
	
	/*
	 * 	Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
	 *	If d(a) = b and d(b) = a, where a /= b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 	 *
	 *	For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
	 *  The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
	 *	
	 *	Evaluate the sum of all the amicable numbers under 10000.
	 */
	
	
	
	public int run(){
		int[] sumDivisor = new int[10001];
		for(int i = 0; i<sumDivisor.length; i++){
			sumDivisor[i] = getSumOfDivisors(i);
		}
		int result = 0;
		int a,b;
		for(int i = 1; i<=10000; i++){
			a = sumDivisor[i];
			for(int r = 1; r<=10000; r++){
				b = sumDivisor[r];
				if(a == r && b == i && a!=b){
					System.out.println("i: "+i+" r: "+r+" a: "+a+" b: "+b+" Result: "+result);
					result = result+i;
				}
			}
		}
		return result;
	}
	
	public int getSumOfDivisors(int num){
		int result = 0;
		for(int i = num/2; i>0; i--){
			if(num % i == 0){
				result = result + i;
			}
		}
		return result;
	}
}
