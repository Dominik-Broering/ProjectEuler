package problem11to20;

import java.math.BigInteger;

import main.ReadWriteTextFile;

public class Problem13 {
	
	/*
	 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
	 */
	
	BigInteger[] nums = new BigInteger[100];
	BigInteger result = BigInteger.valueOf(0);
	ReadWriteTextFile rw = new ReadWriteTextFile();
	String[] array = rw.readLinesToArray("/src/problem11to20/Problem13Input.txt", true);
	
	public BigInteger run(){
		for(int i = 0; i<nums.length; i++){
			nums[i] = BigInteger.valueOf(Long.parseLong(array[i]));
			System.out.println(nums[i]);
		}
		for(int i = 0; i<nums.length; i++){
			result = result.add(nums[i]);
		}
		return result;
	}
}
