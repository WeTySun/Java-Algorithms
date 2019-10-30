/* Given unsorted array of integers, check if it contains four elements tuple
(Quadruplets) having given sum.*/
// Naive recursive approach

class Main
{
	// Naive recursive function to check if Quadruplet exists in an array
	// with given sum
	public static boolean quadTuple(int[] A, int n, int sum, int count)
	{
		// if desired sum is reached with 4 elements, return true
		if (sum == 0 && count == 4) {
			return true;
		}

		// return false if sum is not possible with current configuration
		if (count > 4 || n == 0) {
			return false;
		}

		// Recur with
		// 1. including current element
		// 2. excluding current element

		return quadTuple(A, n - 1, sum - A[n - 1], count + 1) ||
						quadTuple(A, n - 1, sum, count);
	}

	// main function
	public static void main(String[] args)
	{
		int[] A = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int sum = 20;

		if (quadTuple(A, A.length, sum, 0)) {
			System.out.print("Quadruplet Exists");
		} else {
			System.out.print("Quadruplet Don't Exist");
		}
	}
}