import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* Given an array of integers, find a subset in it that has maximum product of its elements. */

class Util
{
	// Function to generate the product of all elements in the given
	// set and update maximum product found so far
	public static int maxProduct(List<Integer> set, int maximum)
	{
		int product = 1;

		for (int j : set) {
			product = product * j;
		}

		// if the set is not empty, then update the product
		if (set.size() != 0) {
			maximum = Integer.max(maximum, product);
		}

		return maximum;
	}

	// Function to generate power set of given set S
	public static int findPowerSet(List<Integer> S, List<Integer> set,
									int n, int maximum)
	{
		// if we have considered all elements, we have generated a subset
		if (n == 0)
		{
			// compute its product of elements & update maximum 
			// product found so far
			return maxProduct(set, maximum);
		}

		// consider nth element
		set.add(S.get(n - 1));
		maximum = findPowerSet(S, set, n - 1, maximum);

		// or don't consider nth element
		set.remove(set.size()-1);
		return findPowerSet(S, set, n - 1, maximum);
	}

	// main function
	public static void main(String[] args)
	{
		List<Integer> S = Arrays.asList(-6, 4, -5, 8, -10, 0, 8);
		int n = S.size();

		List<Integer> set = new ArrayList<>();
		int maximum = findPowerSet(S, set, n, Integer.MIN_VALUE);

		System.out.print("The maximum product of a subset is " +  maximum);
	}
}