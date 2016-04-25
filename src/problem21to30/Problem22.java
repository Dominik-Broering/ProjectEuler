package problem21to30;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem22 {
	
	/*
	 * 	Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, 
	 *  begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, 
	 *  multiply this value by its alphabetical position in the list to obtain a name score.
	 *
	 *	For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, 
	 *  is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
  	 *
	 *	What is the total of all the name scores in the file?
	 */
	
	
	public BigInteger run(){
		BigInteger result = BigInteger.valueOf(0);
		String[] sortedNames = sortNames(Problem22Input.getNames());
		int[] nameScore = new int[sortedNames.length];
		for(int i = 0; i<nameScore.length; i++){
			result = result.add(BigInteger.valueOf(getNameScore(sortedNames[i])*(i+1)));
		}
		return result;
	}
	
	public int getNameScore(String name){
		char[] nameArr = name.toCharArray();
		int result = 0;
		int charScore;
		for(int i = 0; i<nameArr.length; i++){
			charScore = (int)nameArr[i]-64;
			result = result + charScore;
			
		}
		return result;
	}
	
	public String[] sortNames(String[] names){
		Arrays.sort(names);
		return names;
	}
	
}
