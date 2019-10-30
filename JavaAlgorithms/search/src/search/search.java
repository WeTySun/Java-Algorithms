package search;

/* This algorithm find pair between two numbers
 * in array for example { 2,3,4 } find:
 * sum = 5, 2 + 3 = 5 - Good! index:0 and 1. */

public class search {
	public static void find(int[] A, int sum)
	{
		for(int i = 0; i < A.length - 1; i++)
		{
			for (int j = i + 1; j < A.length; j++)
			{
				if(A[i] + A[j] == sum)
				{
					System.out.println("Pair found at index " + i + " and " + j);
					
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}
	
	public static void main(String[] args)
	{
		int A[] = { 8, 7, 2, 5, 3, 1};
		int sum = 4;
		
		find(A, sum);
	}
}
