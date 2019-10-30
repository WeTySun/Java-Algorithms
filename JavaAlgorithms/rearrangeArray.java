/* Given an unsorted array of integers whose each element lies in range
0 to n-1 where n is the size of the array, rearrange array such that A[A[i]]
is set to i for every element A[i] in the array. */
import java.util.Arrays;

class Rearrange
{
	public static void rearrange(int[] A)
	{
		// create an auxiliary array of same size as A[]
		int[] aux = new int[A.length];

		// for each element A[i], set the value i at index A[i]
		// in the auxiliary array
		for (int i = 0; i < A.length; i++) {
			aux[A[i]] = i;
		}

		// update original array with auxiliary array elements
		for (int i = 0; i < A.length; i++) {
			A[i] = aux[i];
		}
	}

	public static void main (String[] args)
	{
		int[] A = { 1, 3, 4, 2, 0 };

		rearrange(A);

		System.out.println(Arrays.toString(A));
	}
}