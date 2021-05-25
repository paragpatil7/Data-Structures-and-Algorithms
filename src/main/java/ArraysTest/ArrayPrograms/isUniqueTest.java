package ArraysTest.ArrayPrograms;

public class isUniqueTest {
	public static void main(String[] args) {
		isUniqueTest mn = new isUniqueTest();
	    int[] intArray = {1,2,3,6,5,6};
	    boolean result = mn.isUnique(intArray);
	    System.out.println(result);
	  }

	  // Is Unique
	  public boolean isUnique(int[] intArray) {
	    for (int i =0; i<intArray.length; i++) {
	      for (int j = i+1; j<intArray.length; j++) {
	        if (intArray[i] == intArray[j]) {
	          return false;
	        }
	      }
	    }
	    return true;
	  }

}
