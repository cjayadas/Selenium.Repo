package HomeAssignment.Week1.Day2;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring the First Array
		int array1[]= {3,2,11,4,6,7};
		//Declaring the Second Array
		int array2[]= {1,2,8,4,9,7};
		
		System.out.println("Matching items in both arrays:");
		
		//For loop iterator from 0 to array length
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = 0; j < array2.length; j++) 
			{
				//Comparing both the arrays using a conditional statement.
				if (array1[i] == array2[j]) 
				{
					System.out.println(array1[i]);
				}
			}
		}
				
		
	}

}
