
/**
 * 
 */

/**
 * Author      : Sushma Devlatkar
 * Date        : 15th April 2022
 * Description : This  program helps to understand how to create and display a singly linked list
 *
 */
public class SingleLinkedList {

	Node head;
	Node temp = null;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			temp = newNode;
		} else {
			temp.next = newNode;
			temp = newNode;
		}
	}

	public void display() {
		System.out.println("Node of the single linked list:");
		temp = head;
		while (temp != null) {
			System.out.print("Data=" + temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// Add nodes to the list
		SingleLinkedList list = new SingleLinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);

		// display the nodes in the list
		list.display();
	}
}
