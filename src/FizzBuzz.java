
public class FizzBuzz {
	public boolean checkPrime(int num)
	{
		//check number is prime
		boolean isPrime = true;
		for(int i =2; i< num-1; i++)
		{
			if(num%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		System.out.println("num :" +num);
		System.out.println("is prime :" +isPrime);
		return isPrime;
	}
public String buzzzz(int num)
{
boolean isPrime = checkPrime(num);
	//
	if(isPrime == true)
	{
		return "whizz";
	}
	if(num%15 == 0)
	{
	return "fizzbuzz";
	}
	else if(num %5 == 0)
	{
		return "buzz";
	}
	else if(num % 3 == 0)
	{
		return "fizz";
	}
	
	return String.valueOf(num);
}
}
