package problem01to10;

public class Problem9 {
	
	/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * a2 + b2 = c2
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 *
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
	 */

	public int run(){
		int result = 0;
		for(int a = 1; a<=900; a++){
			for(int b = a; b<=900; b++){
				for(int c = b; c<=900; c++){
					if(a+b+c == 1000){
						if(Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2)){
							result = a*b*c;
							System.out.println(a+" "+b+" "+c+" "+result);
							break;
						}
					}
				}
			}
		}
		return result;
	}
	
}
