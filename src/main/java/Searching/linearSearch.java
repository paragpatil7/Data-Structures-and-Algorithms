package Searching;

public class linearSearch {
	
	
	public int linearSearchTest(int[] arrtest, int searchvalue)
	{
		for(int i=0;i<arrtest.length;i++)
		{
			if(arrtest[i]==searchvalue)
			{
				System.out.println("The element is found at the index: " + i);
		        return i;
			}
		}
		System.out.println("The element " + searchvalue+ " not found.");
	    return -1;
	}

}
