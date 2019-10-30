import java.util.Arrays;
 // Given an array of integers, algorithm sort it using selection sort algorithm.
 /* Selection sort is a unstable, in-place sorting algorithm known for its
 simplicity, and it has performance advantages over more complicated algorithms
 in certain situations, particularly where auxiliary memory is limited. */
class SelectionSort
{
	// Utility function to swap values at two indices in the array
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Recursive function to perform selection sort on sub-array arr[i..n-1]
	public static void selectionSort(int[] arr, int i, int n)
	{
		// find the minimum element in the unsorted sub-array[i..n-1]
		// and swap it with arr[i]
		int min = i;
		for (int j = i + 1; j < n; j++)
		{
			// if arr[j] element is less, then it is the new minimum
			if (arr[j] < arr[min]) {
				min = j;	// update index of min element
			}
		}

		// swap the minimum element in sub-array[i..n-1] with arr[i]
		swap(arr, min, i);

		if (i + 1 < n) {
			selectionSort(arr, i + 1, n);
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 3, 5, 8, 4, 1, 9, -2 };

		selectionSort(arr, 0, arr.length);

		// print the sorted array
		System.out.println(Arrays.toString(arr));
	}
}