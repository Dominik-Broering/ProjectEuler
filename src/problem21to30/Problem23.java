package problem21to30;

import java.math.BigInteger;

public class Problem23 {
	
	/*
	 * 	The Fibonacci sequence is defined by the recurrence relation:

		Fn = Fn-1 + Fn-2, where F1 = 1 and F2 = 1.
		Hence the first 12 terms will be:

		F1 = 1
		F2 = 1
		F3 = 2
		F4 = 3
		F5 = 5
		F6 = 8
		F7 = 13
		F8 = 21
		F9 = 34
		F10 = 55
		F11 = 89
		F12 = 144
		The 12th term, F12, is the first term to contain three digits.
		
		What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
	 */
	
	public int run(){
		int count = 3;
		BigInteger a = BigInteger.valueOf(1);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger temp;
		boolean running = true;
		while(running ){
			temp = a;
			a = a.add(b);
			b = temp;
			if(count > 4780){
				System.out.println("Count: "+count+" a: "+a);
			}
			char[] aArr = a.toString().toCharArray();
			if(aArr.length >= 1000){
			
				break;
			}
			count++;
		}
		return count;
	}
}
