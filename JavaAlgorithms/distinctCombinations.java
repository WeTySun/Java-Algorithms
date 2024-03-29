/* this algorithm should print only distinct combinations. For example, for above
input, either {1, 2} or {2, 1} should be considered. */
class Util
{
	// Function to print all distinct combinations of length k
	public static void recur(int[] A, String out, int n, int k)
	{
		// invalid input
		if (k > n) {
			return;
		}

		// base case: combination size is k
		if (k == 0) {
			System.out.println(out);
			return;
		}

		// start from next index till first index
		for (int i = n - 1; i >= 0; i--)
		{
			// add current element A[i] to output and recur for next index
			// (i-1) with one less element (k-1)
			recur(A, (A[i]) + " " + out, i, k - 1);

			// uncomment below code to handle duplicates
			/* while (i > 0 && A[i] == A[i - 1]) {
				i--;
			}*/
		}
	}

	// Find all distinct combinations of given length
	public static void main(String[] args)
	{
		int[] A = { 1, 2, 3 };
		int k = 2;

		// if array contains repeated elements,
		// sort the array to handle duplicate combinations
		// Arrays.sort(A);

		// process elements from right to left
		recur(A, "", A.length, k);
	}
}