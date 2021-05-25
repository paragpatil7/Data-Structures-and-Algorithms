package Stack;

public class StackArray {

	int[] arrTest;
	int topofStack;
	
	public StackArray(int Size)
	{
		this.arrTest=new int[Size];
		this.topofStack=-1;
		System.out.println("The Stack is created with size of: " + Size);
	}
	
	
	 // isEmpty
	public boolean isEmpty()
	{
		if(topofStack==-1)
		{
			return true;
	    } else
	    {
	      return false;
	    }
	}
	
	
	 // isFull
	public boolean isFull()
	{
		if(arrTest.length-1==topofStack)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	// Push
	
	public void push(int value)
	{
		if(isFull())
		{
			 System.out.println("The Stack is full!");
		}
		else
		{
			arrTest[topofStack+1]=value;
			topofStack++;
			System.out.println("The value is successfully inserted");
		}
	}
	
	
	//pop
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("The Stack is Empty!");
			return -1;
		}
		else
		{
			int value=arrTest[topofStack];
			topofStack--;
			return value;
		}
	}
	
	
	// Peek method
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("The Stack is Empty!");
			return -1;
		}
		else
		{
			return arrTest[topofStack];
		}
	}
	
	
	
//  Delete method
	public void delete()
	{
		arrTest=null;
		 System.out.println("The Stack is successfully deleted");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
