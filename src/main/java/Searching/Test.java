package Searching;

public class Test {
	
	public static void main(String[] args) {
	    int[] arr = {8, 9, 12, 15, 17, 19, 20, 21, 28};
	    //Searching.binarySearch(arr, 20);
	    linearSearch ls=new linearSearch();
	    int index=ls.linearSearchTest(arr, 20);
	    System.out.println(" Index of search element is "+index);
	    
	    
	    //for Binary search array should be sorted already then only we can apply Binary Search
	    binarySearch bs=new binarySearch();
	    int index2=bs.binarySearchTest(arr, 20);
	    System.out.println(" Index of search element is "+index2);
	  }

}
