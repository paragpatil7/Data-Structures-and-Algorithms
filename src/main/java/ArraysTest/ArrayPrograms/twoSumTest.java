package ArraysTest.ArrayPrograms;

import java.util.Arrays;

public class twoSumTest {
	
	public static void main(String[] args) {
		twoSumTest mn = new twoSumTest();
	    int[] intArray = {2,7,13,15};
	    int[] result = mn.twoSum(intArray,9 );
	    System.out.println(Arrays.toString(result));



	  }

	public int[] twoSum(int[] intArray,int target)
	{
		
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=i+1;j<intArray.length;j++)
			{
				//System.out.println(" i "+i +" j "+j);
				
				if(intArray[i]+intArray[j] == target)
				{
					return new int[] {i, j};
					
				}
			}
		}
		throw new IllegalArgumentException("No solution found");
		
		
		}
	
	

}
