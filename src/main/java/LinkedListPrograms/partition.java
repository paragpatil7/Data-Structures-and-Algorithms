package LinkedListPrograms;

public class partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LinkedList LL=new LinkedList();
		LL.createLL(2);
		LL.insertNode(4);
		LL.insertNode(8);
		LL.insertNode(3);
		LL.insertNode(7);
		LL.insertNode(7);
		
		LL.traversalLL();
	LinkedList LL2=	partitionTest(LL,3);
	LL2.traversalLL();
		
		
	}

	public static LinkedList partitionTest(LinkedList LL,int n)
	{
	Node CurrentNode=LL.head;
	LL.tail=LL.head;
	while(CurrentNode !=null)
	{
		Node Next=CurrentNode.next;
		if(CurrentNode.value < n)
		{
			CurrentNode.next=LL.head;
			LL.head=CurrentNode;
			
		}
		else
		{
			LL.tail.next=CurrentNode;
			LL.tail=CurrentNode;
		}
		CurrentNode=Next;
	}
		LL.tail.next=null;
		return LL;
	}
}











