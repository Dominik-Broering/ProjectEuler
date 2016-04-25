package problem01to10;

public class Problem3 {
	
	/*The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	
	long number;
	
	public Problem3(long number){
		this.number = number;
	}
	
	public long run(){
		System.out.println("STARTED");
		long result = 0;
		for(long i = 1; i<number/2; i++){
			if(number % i == 0){
				System.out.println("SUCCES: "+i);
				if(isPrime(i)){
					result = i;
					System.out.println("IS PRIME: "+i);
				}
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
