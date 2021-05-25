package ArraysTest;

public class SingleDimenArray {
	int arr[]=null;
	
	
	

	public SingleDimenArray(int ArraySize)
	{
		arr = new int[ArraySize];
		for(int i=0;i<ArraySize;i++)
		{
			arr[i]=Integer.MIN_VALUE;
		}
		
	}
	
	
	public void insertArrayElement(int index,int valuetoinsert)
	{
		try
		{
				if(arr[index]==Integer.MIN_VALUE)
					{
						arr[index]=valuetoinsert;
						System.out.println("Successfully inserted");
					}
				else
					{
						System.out.println("This cell is already occupied");
					}
		}
		catch(Exception e)
		{
			System.out.println("Invalid index to access array!");
		}
	}

	
	 // Array Traversal
	  public void traverseArray() {
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i] + " ");
		  }
	  }
	  
	  
	  //Search for an element in the given Array
		public void searchInArray(int valueToSearch) {
			for(int i=0;i<arr.length;i++)
			  {
				if(arr[i]==valueToSearch)
				{
					System.out.println("Value is found at the index of " + i);
			        return;
				}
			  }
			System.out.println(valueToSearch + " is not found");
			
		}
		
		// Delete value from Array
		  public void deleteValue(int valueToDeleteIndex) {
			  try
			  {
				  arr[valueToDeleteIndex]=Integer.MIN_VALUE;
				  System.out.println("The value has been deleted successfully");
			  }
			  catch(Exception e)
			  {
				  System.out.println("The value that is provided is not in the range of array");
			  }
		  }
}
