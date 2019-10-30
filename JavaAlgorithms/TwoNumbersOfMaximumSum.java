import java.util.Arrays;
import java.util.Comparator;
/* Given an array of integers between 0 to 9, find two numbers with maximum
sum formed by using all digits of the array. The difference in number of digits
of the two numbers should be +- 1. */
class Util
{
	// Find two numbers with maximum sum formed by digits of an array
	public static void maximumSum(Integer[] input)
	{
		// sort the array in descending order
		Arrays.sort(input, Comparator.reverseOrder());

		// fill x with digits at the odd indices of sorted array
		int x = 0;
		for (int i = 0; i < input.length; i = i + 2) {
			x = x * 10 + input[i];
		}

		// fill y with digits at the even indices of sorted array
		int y = 0;
		for (int i = 1; i < input.length; i = i + 2) {
			y = y * 10 + input[i];
		}

		// print x and y
		System.out.println("The two numbers with maximum sum are "
									+ x + " and " + y);
	}

	// main function
	public static void main(String[] args)
	{
		Integer[] input = { 4, 6, 2, 7, 9, 8 };

		maximumSum(input);
	}
}