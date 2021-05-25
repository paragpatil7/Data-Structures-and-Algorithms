package Stack;


public class LinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createSinglyLinkedList(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.Next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  // Insert Method SinglyLinkedList
  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createSinglyLinkedList(nodeValue);
      return;
    } else if (location == 0) {
      node.Next = head;
      head = node;
    } else if (location >= size) {
      node.Next = null;
      tail.Next = node;
      tail = node;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.Next;
        index++;
      }
      Node nextNode = tempNode.Next;
      tempNode.Next = node;
      node.Next = nextNode;
    }
    size++;
  }

  // SinglyLinkedList Traversal
  public void traverseSinglyLinkedList() {
    if (head == null) {
      System.out.println("SLL does not exist!");
    } else {
      Node tempNode = head;
      for (int i = 0; i<size; i++) {
        System.out.print(tempNode.value);
        if (i != size - 1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.Next;
      }
    }
    System.out.println("\n");
  }

  // Search for a node

  boolean searchNode(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for (int i=0; i<size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("Found the node at location: " +i+"\n");
          return true;
        }
        tempNode = tempNode.Next;
      }
    }
    System.out.print("Node not found! ");
    return false;
  }

  //Deleting a node from SinglyLinkedList
  public void deletionOfNode(int location) {
    if (head == null) {
      System.out.println("The SLL does not exist");
      return;
    } else if (location == 0) {
      head = head.Next;
      size--;
      if (size == 0) {
        tail = null;
      }
    } else if (location >= size) {
      Node tempNode = head;
      for (int i = 0; i < size - 1; i++) {
        tempNode = tempNode.Next;
      }
      if (tempNode == head) {
        tail = head = null;
        size--;
        return;
      }
      tempNode.Next = null;
      tail = tempNode;
      size--;
    } else {
      Node tempNode = head;
      for (int i = 0; i <location-1; i++) {
        tempNode = tempNode.Next;
      }
      tempNode.Next = tempNode.Next.Next;
      size--;
    }
  }

//  Delete Entire SinglyLinkedList
public void deleteSLL() {
  head = null;
  tail = null;
  System.out.println("The SLL deleted successfully");
}

}

