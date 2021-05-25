package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 17,3 ,1,22,2,7};
		InsertionSort ss =new InsertionSort();
		ss.printArray(arr);
		ss.InsertionSortTest(arr);
		ss.printArray(arr);
	}
	
	public void InsertionSortTest(int [] arrTest)
	{
		for(int i=1;i<arrTest.length;i++)
		{
			int temp=arrTest[i];
			int j=i;
			while(j>0 && arrTest[j-1] > temp) //while(i >0 && arrTest[i-1]>temp)
			{
				arrTest[j]=arrTest[j-1];
				j--;
			}
			arrTest[j]=temp;
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
