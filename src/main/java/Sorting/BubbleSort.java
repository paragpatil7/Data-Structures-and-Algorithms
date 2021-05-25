package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {8, 17,3 ,1,22,2,7};
		BubbleSort bs=new BubbleSort();
		bs.printArray(arr);
		bs.BubbleSortTest(arr);
		bs.printArray(arr);
	}
	
	public void BubbleSortTest(int [] arrtest)
	{
		int n=arrtest.length;
		
		for(int i=0;i<n-1;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				//System.out.println("I "+ i+ " J " + j );
				//System.out.println("J "+ j+ " J+1 " + (j+1) );
				if(arrtest[j] > arrtest[j+1])
				{
					int temp=arrtest[j];
					arrtest[j] =arrtest[j+1];
					arrtest[j+1]=temp;
							
				}
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
