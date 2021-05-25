package LinkedListPrograms;

public class SumLists {

	public static void main(String[] args) {
		
		//Sum of 2 Lists in 3rd list
		
		LinkedList LLA=new LinkedList();
		LLA.createLL(7);
		LLA.insertNode(1);
		LLA.insertNode(6);
		LLA.traversalLL();
		
		LinkedList LLB=new LinkedList();
		LLB.createLL(5);
		LLB.insertNode(9);
		LLB.insertNode(2);
		
		LLB.traversalLL();
		
	LinkedList LLC=	SumListsTest(LLA,LLB);
		LLC.traversalLL();
		

	}
	
	public static LinkedList SumListsTest(LinkedList LLA,LinkedList LLB)
	{
		Node n1=LLA.head;
		Node n2=LLB.head;
		
		int carry=0;
		
		LinkedList resultLL=new LinkedList();
		while(n1 != null || n2 != null)
		{
			int result=carry;
			if(n1 !=null)
			{
				result=result+n1.value;
				n1=n1.next;
			}
			if(n2 != null)
			{
				result=result+n2.value;
				n2=n2.next;
			}
			resultLL.insertNode(result%10);
			carry=result/10;
			
		}
		
		
		return resultLL;
	}

}
