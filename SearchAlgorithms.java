public class SearchAlgorithms {
	
	public static void main(String[] args)
	{
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2 = {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binSearch(test1,3)); //2
		System.out.println(linSearch(test1,3)); //2
		
		System.out.println(binSearch(test2,23)); //7
		System.out.println(linSearch(test2,23)); //7
		
		System.out.println(binSearch(test2,25)); //-1
		System.out.println(linSearch(test2,25)); //-1
		
		System.out.println(binSearch(test1,10)); //9
		System.out.println(linSearch(test1,1)); //0
		
		System.out.println(binSearch(test1,1)); //0
	}
	public static int binSearch(int[] arr , int yaes)
	{
		int L =0 ; int R = arr.length-1 ; int mid = (L + (R))/2 ;  
		while (L <= R )
		{
			if (arr[mid] == yaes ) 
				return mid ; 
			if (arr[mid] > yaes)
				R = mid ; 
				mid = (L + (R))/2 ; 
			if (arr[mid] < yaes)
				L  = mid + 2 ; 
				mid = (L + (R))/2 ; 
		}
	
		return -1;
	}
	public static int linSearch(int[] arr , int yaes)
	{
		for ( int i=0 ; i <arr.length ; i++)
		{
			if (yaes ==arr[i])
				return i ; 
				
		}	
		return -1;
	}
}
