package LinkedListPrograms;

public class nthToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList LL=new LinkedList();
		LL.createLL(2);
		LL.insertNode(4);
		LL.insertNode(4);
		LL.insertNode(3);
		LL.insertNode(7);
		LL.insertNode(7);
		
		LL.traversalLL();
		Node n=nthToLastTest(LL,2);
		System.out.println(n.value);
		
	}

	public static Node nthToLastTest(LinkedList LL,int n)
	{
		Node P1=LL.head;
		Node P2=LL.head;
		
		for(int i=0;i<n;i++)
		{
			if(P2==null)
			{
				return null;
			}
			P2=P2.next;
		}
		
		while(P2!=null)
		{
		P1=P1.next;
		P2=P2.next;
		}
		
		return P1;
		
	}
	
	
}
