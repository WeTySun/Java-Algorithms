import java.util.Set;
import java.util.HashSet;
/* This algorithm check if array have
 * sum of array who output is zero. */
public class SumZero {
	public static Boolean zeroSumArray(int[] A)
	{
		Set<Integer> set = new HashSet<>();
		
		set.add(0);
		
		int sum = 0;
		
		for(int i = 0; i < A.length; i++)
		{
			sum += A[i];
			
			if(set.contains(sum))
			{
				return true;
			}
			
			set.add(sum);
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int[] A = { 4, -6, 3, -1, 4, 2, 7 };
		
		if(zeroSumArray(A))
		{
			System.out.println("Subarray exists");
		} else {
			System.out.println("Subarray do not exist");
		}
	}
}
