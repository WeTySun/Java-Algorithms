package majorityElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
/*Array of integers containing duplicates,
this algorithm return the majority element
in an array if present. A majority element
appears more than n/2 times where n is the
size of the array. */
public class majority {
	// function to return majority element present in given array
	public static int Majority(int[] arr)
	{
		// create an empty Hash Map
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(map.get(arr[i]) == null)
			{
				map.put(arr[i], 0);
			}
			
			map.put(arr[i], map.get(arr[i]) + 1);
		}
		
		// return the element if its count is more than n/2
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, Integer> pair = it.next();
			if(pair.getValue() > arr.length/2)
				return pair.getKey();
			
			it.remove();
		}
		
		// if no majority element is present
		return -1;
		
}
	
	public static void main (String[] args)
	{
		// valid input (majority element is present)
		int arr[] = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
		
		int res = Majority(arr);
		if(res != -1)
		{
			System.out.println("Majority element is " + res);
		} else {
			System.out.println("Majority element does not exist");
		}
	}
}
