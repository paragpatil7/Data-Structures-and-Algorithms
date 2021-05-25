package CircularSinglyLinkedList;

import SinglyLinkedList.Node;

public class CircularSinglyLinkedList {
public Node Head;
public Node Tail;
public int Size;

public Node createCSLL(int nodeValue) {
	Head=new Node();
	Node node=new Node();
	node.value=nodeValue;
	node.Next=node;
	Head=node;
	Tail=node;
	Size=1;
	
	return Head;
	
}


//  Insertion Method
public void insertCSLL(int nodeValue, int location) {
	Node node=new Node();
	node.value=nodeValue;
	if(Head==null)
	{
		createCSLL(nodeValue);
	      return;
	}
	else if(location==0)
	{
		node.Next=Head;
		Head=node;
		Tail.Next=node;
	}
	else if(location >=Size)
	{
		Tail.Next=node;
		Tail=node;
		node.Next=Head;
		
	}else
	{
		Node TempNode=Head;
		int index=0;
		while(index < location-1)
		{
			TempNode=TempNode.Next;
			index++;
		}
		
		Node NextNode=TempNode.Next;
		TempNode.Next=node;
		node.Next=NextNode;
		
		//or 
		//node.Next=TempNode.Next;
		//TempNode.Next=node;
	}
	Size++;
}

// Traversal Method
public void traverseCSLL() {
	if (Head==null)
	 {
		 System.out.println("CSLL does not exist!");
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


// Search Method

public boolean searchNode(int nodeValue) {
  if (Head != null) {
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
  	  System.out.println("Node not found! ");
  	  return false;
}


//Delete Method

public void deleteNode(int location) {
if (Head==null)
{
	System.out.println("The CSLL does not exist");
    return;
}
else if(location==0)
{
	Head=Head.Next;
	Tail.Next=Head;
	Size--;
	if(Size==0)
	{
		Head=null;
		Head.Next=null;
		Tail=null;
		
	}
	
}else if(location >=Size)
{
	Node TempNode=Head;
	for(int i=0;i<Size-1;i++)
	{
		TempNode= TempNode.Next;
	}
	if(TempNode==Head)
	{
		Head.Next=null;
		Head=Tail=null;
		Size--;
		return;
	}
	TempNode.Next=Head;
	Tail=TempNode;
	Size--;
	
}else
{
	Node TempNode=Head;
	for(int i=0;i< location-1;i++)
	{
		TempNode=TempNode.Next;
	}
	
	TempNode.Next=TempNode.Next.Next;
	Size--;
}
	
}
// Delete CSLL


public void deleteCSLL()
{
	if(Head==null)
	{
		System.out.println("The CSLL does not exist!");
    } else {
    	
    	Tail.Next=null;
    	Head=null;
    	Tail=null;
    	System.out.println("The CSLL has been deleted!");
	}
	
}













}






