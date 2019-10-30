import java.util.HashSet;
import java.util.Set;
/* Given an unsorted array of integers, print all pairs with given difference
k in it. */
class Util
{
	// Function to find pair with given difference in the array
	// This method do not handle duplicates in the array
	public static void findPair(int[] A, int diff)
	{
		// array is unsorted

		// take an empty set
		Set<Integer> set = new HashSet<>();

		// do for each element in the array
		for (int i: A)
		{
			// check if pair with given difference (i, i-diff) exists
			if (set.contains(i - diff)) {
				System.out.println("(" + i + ", " + (i - diff) + ")");
			}

			// check if pair with given difference (i+diff, i) exists
			if (set.contains(i + diff)) {
				System.out.println("(" + (i + diff) + ", " + i + ")");
			}

			// insert element into the set
			set.add(i);
		}
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { 1, 5, 2, 2, 2, 5, 5, 4};
		int diff = 3;

		findPair(A, diff);
	}
}