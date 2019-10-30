
public class BinarySearch {
	// returns index of x if it is present in arr[1..r],
	// else return -1
	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - 1) / 2;
			
			// middle
			if(arr[mid] == x)
				return mid;
			
			// left
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			
			// right
			return binarySearch(arr, mid + 1, r, x);
		}
		
		return -1;
	}
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40};
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if(result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
