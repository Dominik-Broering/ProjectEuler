package problem11to20;

public class Problem14 {
	
	/*
	 * The following iterative sequence is defined for the set of positive integers:

		n -> n/2 (n is even)
		n -> 3n + 1 (n is odd)

		Using the rule above and starting with 13, we generate the following sequence:

		13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
		It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	
		Which starting number, under one million, produces the longest chain?

		NOTE: Once the chain starts the terms are allowed to go above one million.
	 */
	
	int count = 1;
	int result = 0;
	long resultNum;
	long temp = 0;
	
	public long run(){
		for(long i = 0; i<1000000; i++){
			temp = i;
			while(temp>1){
				if(temp % 2 == 0){
					temp = temp / 2;
				}else{
					temp = (3*temp)+1;
				}
				if(temp>=1000000){
				}
				count++;
			}
			if(result < count){
				result = count;
				resultNum = i;
				System.out.println("Result: "+result+" ResultNum: "+resultNum);
			}
			count = 1;
		}
		return resultNum;
	}
}
