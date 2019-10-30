package pairHashing;
import java.util.HashMap;
import java.util.Map;

/* This algorithm find pair between two numbers
 * in array for example { 2,3,4 } find:
 * sum = 5, 2 + 3 = 5 - Good! index:0 and 1. 
 * Find sum of array with hashing algorithm.*/
public class pairHashing {
	// method to find pair of array
	public static void findPair(int[] A, int sum)
	{
		// empty hash map
		Map<Integer, Integer> map = new HashMap<>();
		
		// print each element
		for(int i = 0; i < A.length; i++)
		{
			if(map.containsKey(sum - A[i]))
			{
				System.out.println("Pair found at index " + map.get(sum - A[i]) + " and " + i);
				return;
			}
			
			map.put(A[i], i);
		}
		System.out.println("Pair not found");
	}
	public static void main(String[] args)
	{
		int[] A = { 1,2,3,4,5,6};
		int sum = 3;
		
		findPair(A, sum);
	}
}
