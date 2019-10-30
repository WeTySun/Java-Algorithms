package maxLength;
import java.util.Map;
import java.util.HashMap;

/* Binary array containing zeros and ones
 * find maximum length sub-array having
 * equal number of 0's and 1's. */
public class maxLength {
	public static void max(int[] B)
	{
		Map<Integer, Integer> map = new HashMap();
		
		map.put(0, -1);
		
		int len = 0;
		
		int ending_index = -1;
		
		int sum = 0;
		
		for(int i = 0; i < B.length; i++)
		{
			sum += (B[i] == 0)? -1: 1;
			
			if(map.containsKey(sum))
			{
				if(len < i - map.get(sum))
				{
					len = i - map.get(sum);
					ending_index = i;
				}
			}
			else {
				map.put(sum, i);
			}
		}
		if(ending_index != -1)
		{
			System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
		}
		else {
			System.out.println("No sub-array exists");
		}
	}
	
	public static void main(String[] args)
	{
		int[] B = { 0, 0, 1, 0, 1, 0, 0};
		
		max(B);
	}
}
