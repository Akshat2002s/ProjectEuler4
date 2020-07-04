public class Palindrome
{
	public static void main(String[] args) 
	{
		System.out.println(new Palindrome().run());
	}
	public String run() 
	{
		int Palin = -2;
		for (int i = 100; i < 1000; i++) 
		{
			for (int j = 100; j < 1000; j++) 
			{
				int prod = i * j;
				if (isPalindrome(prod) && prod > Palin)
					Palin = prod;
			}
		}
		return Integer.toString(Palin);
	}
	// Returns the reverse of the given string.
	public static String reverse(String s) 
	{
		return new StringBuilder(s).reverse().toString();
	}
	
	public static boolean isPalindrome(String s) 	
	{
		return s.equals(reverse(s));
	}
	public static boolean isPalindrome(int x) 
	{
		return isPalindrome(Integer.toString(x));
	}
}