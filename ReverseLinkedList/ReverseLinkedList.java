// Reverse Linked List

class ReverseLinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)	{
			data = d;
			next = null;
		}
	}
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}


	void printTheList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}


	public static void main(String[] args){  
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(40);
		list.head.next = new Node(2);
		list.head.next.next = new Node(34);
		list.head.next.next.next = new Node(67);

		System.out.println("Provided List");
		list.printTheList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed list ");
		list.printTheList(head);
	}
  
}


