package ArraysTest;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDimenArray SDA=new SingleDimenArray(4);
		SDA.insertArrayElement(0,22);
		SDA.insertArrayElement(4,2);
		SDA.insertArrayElement(2,11);
		SDA.insertArrayElement(3,7);
		
		SDA.traverseArray();
		
		SDA.searchInArray(7);
		
		SDA.deleteValue(8);
		SDA.deleteValue(3);
		
		SDA.traverseArray();
	}

	
	
}
