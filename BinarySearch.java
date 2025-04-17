import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
	    int bottom = 0;
		int top = ray.length-1;
		int middle = 0;

		while(bottom <= top)
		{
			middle = (bottom+top)/2;
			if(ray[middle] < item)
			{
				bottom = middle+1;
			}
			if(ray[middle] > item)
			{
				top = middle -1;
			}
			if(ray[middle] == item)
			{
				return middle;
			}
		}
		return -1;
	}
}
