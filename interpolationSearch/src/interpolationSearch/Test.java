/* Linear search algorithm finds the element
 * in O(n) time, Jump Search algorithm takes
 * O(sqrt(n)) time and Binary Search take
 * O(Log n) time. */
package interpolationSearch;

// Java algorithm to implement interpolation search
public class Test {
	static int arr[] = new int[] {10, 12, 13, 16, 18,19, 20, 21,
									24,33,35,42,47};
	
	static int interpolationSearch(int x)
	{
		// find indexes of two corners
		int lo = 0, hi = (arr.length - 1);
		
		while(lo <= hi && x >= arr[lo] && x <= arr[hi])
		{
			if(lo == hi)
			{
				if(arr[lo] == x) return lo;
				return -1;
			}
			
			int pos = lo + (((hi-lo)/(arr[hi]-arr[lo]))*(x-arr[lo]));
			
			// middle
			if(arr[pos] == x)
				return pos;
			
			// left
			if(arr[pos] < x)
				lo = pos + 1;
			//right
			else
				hi = pos - 1;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int x = 18;
		int index = interpolationSearch(x);
		
		// if element found
		if(index != -1)
			System.out.println("Element found at index" + index);
		else
			System.out.println("Element not found.");
	}
}
