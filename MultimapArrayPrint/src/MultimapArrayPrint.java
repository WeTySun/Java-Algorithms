import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MultimapArrayPrint {
	private static<K,V> void insert(Map<K, List<V>> hashMap,K key, V value)
	{
	
	if(!hashMap.containsKey(key))
	{
		hashMap.put(key, new ArrayList<>());
	}
	
	hashMap.get(key).add(value);
}
	
	public static void printArray(int[] A)
	{
		Map<Integer, List<Integer>> hashMap = new HashMap<>();
		
		insert(hashMap, 0, -1);
		
		int sum = 0;
		
		for(int i = 0; i < A.length; i++)
		{
			sum += A[i];
			
			if(hashMap.containsKey(sum))
			{
				List<Integer> list = hashMap.get(sum);
				
				for(Integer value: list)
				{
					System.out.println("Subarray [" + (value + 1) + ".." + i + "]");
				}	
			}
			insert(hashMap, sum, i);
		}
	}
	public static void main(String[] args)
	{
		int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		printArray(A);
	}
}