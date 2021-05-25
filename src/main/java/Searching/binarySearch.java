package Searching;

public class binarySearch {

	
	public int binarySearchTest(int [] arrtest, int valueSearch)
	{
		int start=0;
		int end=arrtest.length-1;
		int middle=(start+end)/2;
		
		
			while(arrtest[middle] != valueSearch && start <= end)
			{
				if(arrtest[middle] < valueSearch)
				{
					start=middle+1;
				}
				else
				{
					end=middle-1;
				}
				middle=(start+end)/2;
			}
			
		
		
		if (arrtest[middle] == valueSearch) {
		      System.out.println("The element is found at the index: " + middle);
		      return middle;
		    } else {
		      System.out.println("The element " + valueSearch+ " not found.");
		      return -1;
		    }
	}
}
