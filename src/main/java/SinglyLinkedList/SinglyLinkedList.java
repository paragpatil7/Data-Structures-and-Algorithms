package SinglyLinkedList;

public class SinglyLinkedList {
public Node Head;
public Node Tail;
public int Size;


public Node createSinglyLinkedList(int nodeValue)
{
	Head= new Node(); 
	Node node =new Node();
	node.Next=null;
	node.value=nodeValue;
	Head=node;
	Tail=node;
	Size=1;
	
	
	return Head;
}
	

// Insert Method SinglyLinkedList
public void insertInLinkedList(int nodeValue, int location) {
	Node node=new Node();
	node.value=nodeValue;
	if(Head==null)
	{
		createSinglyLinkedList(nodeValue);
		return;
	}else if(location==0)
	{
		node.Next=Head;
		Head=node;
	}else if(location >= Size)
	{
		node.Next=null;
		Tail.Next=node;
		node=Tail;
	}
	else
	{
		
		Node TempNode=Head;
		int index=0;
		while(index < location-1 )
		{
			TempNode=TempNode.Next;
			index++;
		}
		Node NextNode=TempNode.Next;
		TempNode.Next=node;
		node.Next=NextNode;
		
	}
	Size++;
}



// SinglyLinkedList Traversal
public void traverseSinglyLinkedList() {
 if (Head==null)
 {
	 System.out.println("SLL does not exist!");
 }
 else
 {
	 Node TempNode=Head;
	 for(int i=0;i<Size;i++)
	 {
				 
		 System.out.print(TempNode.value);
	        if (i != Size - 1) {
	          System.out.print(" -> ");
	        }
	        TempNode=TempNode.Next;
	 }
 }
 System.out.println("\n");
}



// Search for a node
boolean searchNode(int nodeValue) {
	if(Head!=null)
	{
		Node TempNode=Head;
		for(int i=0;i<Size;i++)
		{
			if(TempNode.value==nodeValue)
			{
				System.out.print("Found the node at location: " +i+"\n");
				return true;
			}
			TempNode=TempNode.Next;
		}
	}
	System.out.print("Node not found! ");
	return false;
}


//Deleting a node from SinglyLinkedList
public void deletionOfNode(int location) {
	if(Head==null)
	{
		 System.out.println("The SLL does not exist");
	      return;
	}
	else if(location==0)
	{
		
		Head=Head.Next;
		Size--;
		if(Size==0)
		{
			Tail=null;
		}
	}else if(location >=Size)
	{
		Node TempNode=Head;
		for(int i=0;i<Size-1;i++)
		{
			TempNode=TempNode.Next;
		}
		if(TempNode==Head)
		{
			Tail=Head=null;
			Size--;
			return;
		}
		TempNode.Next=null;
		Tail=TempNode;
		Size--;
	}else
	{
		Node TempNode=Head;
		for(int i=0;i<location-1;i++)
		{
			TempNode=TempNode.Next;
		}
		TempNode.Next=TempNode.Next.Next;
		Size--;
	}
	
		
}


//Delete Entire SinglyLinkedList
public void deleteSLL() {
	Head=null;
	Tail=null;
	System.out.println("The SLL deleted successfully");
}

}