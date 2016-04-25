package problem01to10;

public class Problem7 {
	
	/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 */
	
	public int run(){
		int prime = 2;
		int num = 5;
		boolean running = true;
		while(running){
			if(isPrime(num)){
				prime++;
				if(prime == 10001){
					return num;
				}
			}
			num++;
		}
		return 0;
	}
	
	boolean isPrime(int n) {				//Checks Integer for prime Number returns boolean
		if (n == 1) return false;
	    if (n%2==0) return false;
	    for(int i=3; i*i<=n; i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
