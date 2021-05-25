package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 17,3 ,1,22,2,7};
		SelectionSort ss =new SelectionSort();
		ss.printArray(arr);
		ss.selectionSortTest(arr);
		ss.printArray(arr);
	}
	
	public void selectionSortTest(int [] arrTest)
	{
		for(int j=0;j<arrTest.length;j++)
		{
			int minimumIndex=j;
			
			for(int i=j+1;i<arrTest.length;i++)
			{
				if(arrTest[i] < arrTest[minimumIndex])
				{
					minimumIndex=i;
				}
			}
			
			if(minimumIndex != j)
			{
				int	temp=arrTest[j];
					arrTest[j]=arrTest[minimumIndex];
					arrTest[minimumIndex]=temp;
			}
			
		}
		
		
	}
	
	void printArray(int arr[]) {
	    int n = arr.length;
	    for (int i = 0; i<n; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	  }

}
