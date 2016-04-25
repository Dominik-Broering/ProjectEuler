package problem11to20;

public class Problem19 {
	
	/*
	 * 	You are given the following information, but you may prefer to do some research for yourself.

		1 Jan 1900 was a Monday.
		Thirty days has September,
		April, June and November.
		All the rest have thirty-one,
		Saving February alone,
		Which has twenty-eight, rain or shine.
		And on leap years, twenty-nine.
		
		A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
		How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
	 */
	
	private final int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int day;
	private int month;
	private int year;
	private int curDay = 2;
	
	public int run(){
		int result = 0;
		for(year = 1901; year<2001; year++){
			for(month = 0; month<12; month++){
				int amDays = monthDays[month];
				if(month == 1 && getLeapYear(year)){
					amDays++;
				}
				for(day = 1; day<=amDays; day++){
					if(day == 1 && curDay == 7){
						result++;
					}
					curDay++;
					if(curDay == 8){
						curDay = 1;
					}
				}
			}
		}
		return result;
	}
	
	public boolean getLeapYear(int year){
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		}
		return false;
	}
}
