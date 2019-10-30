package shuffleArray;
import java.util.Arrays;
import java.util.Random;
/* Array of integers, in-place shuffle it.
The algorithm should produce an unbiased
permutation and every permutation is equally
likely. */
public class shuffleArray {
	// swap two elements arr[i] and arr[j]
	private static void swap(int[] arr, int i, int j)
	{
		int tm = arr[i];
		arr[i] = arr[j];
		arr[j] = tm;
	}
	
	// function to shuffle an array arr[]
	public static void shuffle(int arr[])
	{
		for(int i = 0; i <= arr.length - 2; i++)
		{
			Random rand = new Random();
			int j = i + rand.nextInt(arr.length - i);
			
			swap(arr, i, j);
		}
	}
	// main function
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		shuffle(arr);
		
		// print shuffled array
		System.out.println(Arrays.toString(arr));
		}
	}