package HomeAssignment.Week1.Day2;

public class IsPrimeNumber 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int pnumber = 27;
		boolean isPrime = true;
		if (pnumber<=1) 
		{
			isPrime=false;
		}
		else
		{
			for (int i = 2; i <= Math.sqrt(pnumber); i++)
			{
				//If the number is divisible by any number in this range, it returns false, 
				if (pnumber % i == 0)
				{
					isPrime = false;
					break;
				}
				else
				{
					isPrime=true;
				}
			}
		}
		if (isPrime)
		{
			System.out.println(pnumber + " is a prime number.");
		}
		else
		{
			System.out.println(pnumber + " is not a prime number.");
		}
		
	}

}
