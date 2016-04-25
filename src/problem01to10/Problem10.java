package problem01to10;

public class Problem10 {
	
	/* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 */
	
	public long run(){
		long result = 0;
		for(long a = 0; a<2000000; a++){
			if(isPrime(a)){
				if(a<100){
					System.out.println(a);
				}
				result = result + a;
			}
		}	
		return result;
	}
	
	boolean isPrime(long n) {				//Checks Integer for prime Number returns boolean
		if (n == 1) return false;
	    if (n%2==0) return false;
	    for(long i=3; i*i<=n; i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
