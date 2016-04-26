package problem31to40;

public class Problem36 {
	
	/*
	 * 	The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 	 *
	 *	Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
	 *
	 *	(Please note that the palindromic number, in either base, may not include leading zeros.)
	 */
	
	public long run(){
		long result = 0;
		for(int i = 1; i<1000000; i++){
			if(checkPalindrome(String.valueOf(i)) && checkPalindrome(Integer.toBinaryString(i))){
				System.out.println("i: "+i+" bin: "+Integer.toBinaryString(i));
				result += i;
			}
		}
		return result;
	}
	
	public static boolean checkPalindrome(String word){
		word = word.toLowerCase();
		char[] wordChar = word.toCharArray();
		char[] reverseWordChar = reverseString(word).toCharArray();
		
		for(int i = 0; i<wordChar.length; i++){
			if(wordChar[i] != reverseWordChar[i]){
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
