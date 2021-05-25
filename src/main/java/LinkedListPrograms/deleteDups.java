package LinkedListPrograms;

import java.util.HashSet;

public class deleteDups {

	public static void main(String[] args) {
		
		LinkedList LL=new LinkedList();
		LL.createLL(2);
		LL.insertNode(4);
		LL.insertNode(4);
		LL.insertNode(3);
		LL.insertNode(7);
		LL.insertNode(7);
		
		LL.traversalLL();
		deleteDupsTest(LL);
		LL.traversalLL();
	}

	public static void deleteDupsTest(LinkedList LL)
	{
	HashSet<Integer> hs=new HashSet();
	Node Current=LL.head;
	Node prev=null;

	while(Current != null)
	{
		int value=Current.value;
		if(hs.contains(value))
		{
			prev.next=Current.next;
			LL.size--;
		}
		else
		{
			hs.add(value);
			prev=Current;
		}
		Current=Current.next;
	}
	
	}
	
	
	
}
