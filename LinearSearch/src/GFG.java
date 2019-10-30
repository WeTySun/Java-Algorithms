/* Given an array[] of n elements
linear algorithm finds number index if it exist
for example: array - {1,2,3,4}, find: 3,
    array finded, index: 2.*/
public class GFG {
	public static int search(int arr[], int x)
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[] = { 2, 3, 4, 10 ,40};
		int x = 2;
		int result = search(arr, x);
		if(result == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at index" + result);
	}
}