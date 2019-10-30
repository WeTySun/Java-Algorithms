package mergeTwoSortedArrays;
/* Two sorted arrays X[] and Y[] of size m
and n each, merge elements of X[] with elements
of array Y[] by maintaining the sorted order.
fill X[] with first m smallest elements and
fill Y[] with remaining elements.*/

import java.util.Arrays;

public class mergeTwoSortedArrays {
	// in-place merge two sorted arrays x[] and y[]
	// invariant: x[] and y[] are sorted at any point.
	public static void merge(int[] x, int[] y)
	{
		int m = x.length;
		int n = y.length;
		
		for(int i = 0; i < m; i++)
		{
			if(x[i] > y[0])
			{
				int temp = x[i];
				x[i] = y[0];
				y[0] = temp;
				
				int first = y[0];
				
				int k;
				for(k = 1; k < n && y[k] < first; k++)
				{
					y[k - 1] = y[k];
				}
				y[k - 1] = first;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] x = { 1, 4, 7, 8, 10};
		int[] y = { 2, 3, 9};
		
		merge(x, y);
		
		System.out.println("x: " + Arrays.toString(x));
		System.out.println("y: " + Arrays.toString(y));
	}
}
