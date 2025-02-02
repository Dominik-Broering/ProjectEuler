package problem11to20;

public class Problem15 {

	/*
	 * Starting in the top left corner of a 2�2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
	 * How many such routes are there through a 20�20 grid?
	 */
	
	public long run(){

		int gridSize = 20;
		long path =1;
 
		for(int i=0 ; i < gridSize ;i++)
		{
			path *= 2*gridSize-i;
			path /= (i+1);
		}
		return path;
	}
}
