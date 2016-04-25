package problem01to10;

public class Problem4 {
	
	/*A palindromic number reads the same both ways. 
	 *The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 *Find the largest palindrome made from the product of two 3-digit numbers.
	 */

	public int run(){
		int result = 0;
		for(int i = 999; i>0; i--){
			for(int r = 999; r>0; r--){
				if(checkForPalindrome(r*i)){
					if(r*i > result){
						result = r*i;
					}
					System.out.println("SUCCES: "+r*i);
				}
			}
		}
		return result;
	}
	
	public boolean checkForPalindrome(int num) {
		char[] numChar = String.valueOf(num).toCharArray();
		char[] reverseNumChar = reverseString(String.valueOf(num)).toCharArray();
		for(int i = 0; i<numChar.length; i++){
			if(numChar[i] != reverseNumChar[i]){
				return false;
			}
		}
		return true;
	}

	public static String reverseString(String input){
		char[] reverse = input.toCharArray();
		String zw = "";
		for(int i = reverse.length-1; i>=0; i--){
			zw = zw + reverse[i];
		}
		return zw;
	}
}
