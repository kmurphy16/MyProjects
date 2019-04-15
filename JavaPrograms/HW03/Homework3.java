/**
*HW3
*@author	Kevin Murphy
*@version 	February 20, 2019
*/

//Top - Generate all possible UNIQUE combinations off the integers 1-100 inclusive, and count them.
public class Homework3
{
	public static void main(String[] args)
	{
	// Initialize a counter to 0;
	int counter = 0;
	int p1;
	int p2; 
	int p3; 
	int p4;
	 // for each possible int value for pOne(starting at 1, ending at 100-3)
		for(p1 = 1; p1 <= 97; p1++)
		{
			// for each possible int value for pTwo(start at pOne + 1, ending at 100-2)
			for(p2 = p1 + 1; p2 <= 98; p2++)
			{
				// for each poss int value for pThree(start at pTwo+1, ending at 100-1)
				for(p3 = p2 + 1; p3 <= 99; p3++)
				{
					// for each possible int value for pFour(starting at pThree+1, ending at 100)
					for(p4 = p3 + 1; p4 <= 100; p4++)
					{
						// increment the counter		
							counter++;
					} // person 4 loop
				}// person 3 loop			
			}// person 2 loop
		}// person 1 loop
		// output of final count, no repeats
		System.out.println(counter);
	}
}


	
