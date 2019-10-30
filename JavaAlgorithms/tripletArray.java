import java.util.Arrays;
/* Given an unsorted array of integers, find a triplet with given sum in it. */
class Main {

	// Function to print all distinct triplet in the array with given sum
	public static void printAllTriplets(int[] arr, int sum)
	{
		// sort the array in ascending order
		Arrays.sort(arr);

		// check if triplet is formed by arr[i] and a pair from
		// sub-array arr[i+1..arr.length)
		for (int i = 0; i <= arr.length - 3; i++)
		{
			// remaining sum
			int k = sum - arr[i];

			// maintain two indices pointing to end-points of the
			// sub-array arr[i+1..n)
			int low = i + 1, high = arr.length - 1;

			// loop till low is less than high
			while (low < high)
			{
				// increment low index if total is less than the remaining sum
				if (arr[low] + arr[high] < k) {
					low++;
				}

				// decrement high index is total is more than the remaining sum
				else if (arr[low] + arr[high] > k) {
					high--;
				}

				// triplet with given sum found
				else {
					// print the triplet
					System.out.println("(" + arr[i] + " " + arr[low] + " " + arr[high] + ")");

					// increment low index and decrement high index
					low++;
					high--;
				}
			}
		}
	}

	// Find Triplet with given sum in an array
	public static void main(String[] args)
	{
		int[] arr = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int sum = 6;

		printAllTriplets(arr, sum);
	}
}