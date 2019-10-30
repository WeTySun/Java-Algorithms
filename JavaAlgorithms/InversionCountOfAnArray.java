/* If (i < j) and (A[i] > A[j]) then the pair(i , j) is called an inversion of an
array A. */
class InversionCount
{
	// Function to find inversion count of the given array
	public static int getInversionCount(int[] arr)
	{
		int inversionCount = 0;
 
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					inversionCount++;
				}
			}
		}
 
		return inversionCount;
	}
 
	public static void main(String[] args)
	{
		int[] arr = { 1, 9, 6, 4, 5 };
 
		System.out.println("Inversion count is " + getInversionCount(arr));
	}
}