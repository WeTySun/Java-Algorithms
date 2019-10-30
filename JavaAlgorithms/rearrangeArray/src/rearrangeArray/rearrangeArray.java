package rearrangeArray;
import java.util.Arrays;

// algorithm rearrange adjacent array
public class rearrangeArray {
	private static void swap(int[] arr, int i , int j)
	{
		int tm = arr[i];
		arr[i] = arr[j];
		arr[j] = tm;
	}
	

	public static void rearrangeArray(int[] arr)
	{
		for(int i = 1; i < arr.length; i += 2)
		{
			if(arr[i - 1] > arr[i])
			{
				swap(arr, i - 1, i);
			}
			
			if(i + 1 < arr.length && arr[i + 1] > arr[i])
			{
				swap(arr, i + 1, i);
			}
		}
	}
	// main function
	public static void main(String[] args)
	{
		int[] arr = { 9, 6, 8, 3, 7 };
		
		rearrangeArray(arr);
		
		// print output array
		System.out.println(Arrays.toString(arr));
	}
}