/* Given an array of integers, duplicates are present in it in such a way that
all duplicates appear even number of times except one which appears odd number of
times. Find that odd appearing element in linear time and without using any extra
memory. */
class Main
{
	// Function to find odd occurring element in a given array
	public static int findOddOccuring(int[] arr)
	{
		int xor = 0;
		for (int i: arr) {
			xor = xor ^ i;
		}

		return xor;
	}

	public static void main(String[] args)
	{
		int[] arr = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };

		System.out.println("Odd occurring element is " + findOddOccuring(arr));
	}
}