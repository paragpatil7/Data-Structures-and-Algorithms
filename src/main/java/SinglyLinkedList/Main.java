package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList SLL=new SinglyLinkedList();
		SLL.createSinglyLinkedList(7);
		
		
		SLL.insertInLinkedList(9, 3);
		SLL.insertInLinkedList(2, 1);
		SLL.insertInLinkedList(8, 2);
		SLL.insertInLinkedList(5, 0);
		
		SLL.traverseSinglyLinkedList();
		
		SLL.deletionOfNode(3);
		SLL.traverseSinglyLinkedList();

		SLL.deleteSLL();
		SLL.traverseSinglyLinkedList();

		
	}

}
