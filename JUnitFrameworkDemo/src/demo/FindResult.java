package demo;

public class FindResult 
{
	public static int FindMaxNum(int arr[])
	  {
	    int max= arr[0];
	    for(int i=1;i<arr.length;i++)
	    {
	      if(max<arr[i])
	        max=arr[i];
	    }
	    return max;
	  }
	
	public static Boolean evenodd(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}
	
}
