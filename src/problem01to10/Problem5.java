package problem01to10;

public class Problem5 {
	
	/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */

	public int run(){
		boolean running = true;
		boolean found = true;
		int num = 1;
		while(running){
			for(int i = 1; i<=20; i++){
				if(num % i != 0){
					found = false;
				}
			}
			if(found == true){
				running = false;
				return num;
			}else{
				found = true;
			}
			num++;
		}
		return 0;
	}
}
