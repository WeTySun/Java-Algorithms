import java.util.Arrays;
/* Given an binary array, sort it linear time
and constant space. Output should print contain
all zeroes followed by all ones. */

public class SortBinaryArray {
	// function to sort binary array in linear time
	public static void sort(int[] A)
	{
		// count number of zeros
		int zeros = 0;
		for(int i = 0; i < A.length; i++)
		{
			if(A[i] == 0)
			{
				zeros++;
			}
		}
		
		// put zeros in the beginning
		int k = 0;
		while(zeros-- != 0)
		{
			A[k++] = 0;
		}
		
		// fill all remaining elements by 1
		while(k < A.length) {
			A[k++] = 1;
		}
	}
	
	// sort binary array in linear time
	public static void main(String[] args)
	{
		int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
		
		sort(A);
		
		System.out.println(Arrays.toString(A));
	}
}
