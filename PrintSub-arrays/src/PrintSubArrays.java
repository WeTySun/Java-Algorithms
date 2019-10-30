
/* This algorithm prints sum of array */
public class PrintSubArrays {
	// Function to print all sub-arrays with 0 sum present
	// in the given array
	public static void PrintSubArrays(int[] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			int sum = 0;
			
			for(int j = i; j < A.length; j++)
			{
				sum += A[j];
				
				if(sum == 0)
				{
					System.out.println("Subarray [" + i + ".." + j + "]");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		
		PrintSubArrays(A);
	}
}
