package findPairSorting;
import java.util.Arrays;
/* This algorithm find pair between two numbers
 * in array for example { 2,3,4 } find:
 * sum = 5, 2 + 3 = 5 - Good! index:0 and 1.
 * The time complexity of above solution is O
 * (nlogn) and auxiliary space used by the program
 * is O(1).*/

public class pairSorting {
	public static void pair(int[] A, int sum)
	{
		// Sort array
		Arrays.sort(A);
	
		int low = 0;
		int high = A.length - 1;
		
		while(low < high)
		{
			if(A[low] + A[high] == sum)
			{
				System.out.println("Pair found");
				return;
			}
			
			if(A[low] + A[high] < sum) {
				low++;
			}else {
				high--;
			}
			}
		System.out.println("Pair not found");
		}
	// find array with given array
	public static void main(String[] args)
	{
		int[] A = { 8, 7, 2, 5, 3, 1};
		int sum = 10;
		
		pair(A, sum);
	}
	}