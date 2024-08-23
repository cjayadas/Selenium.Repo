package HomeAssignment.Week1.Day2;

import java.util.Arrays;

public class FindMissingElement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	//Declaring and Initializing the Array
		int[] array={1,4,3,2,8,6,7};
		Arrays.sort(array);
	
	//Search and Printing the First Missing Element
		int MissNum = findMissingElement(array);
		System.out.println("The First Missing Element is: " + MissNum);
	}
	public static int findMissingElement(int[] array) 
	{
		for (int i = 0; i < array.length - 1; i++) 
		{
			// Check if the difference between before and after element
			//is greater than 1
			if (array[i + 1] != array[i] + 1) 
			{
				// Return the missing element
				 return array[i] + 1;
			}
		}
		return -1;
	}

}
