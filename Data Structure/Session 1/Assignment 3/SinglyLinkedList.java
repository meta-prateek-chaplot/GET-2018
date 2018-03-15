package assignment_3;

import java.util.Scanner;

class Node {
	protected int data;
	protected Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	
	public void setNext(Node link) {
		this.next = link;
	}
	public Node getNext() {
		return next;
	}
}

class LinkedList {
	protected Node start;
	public int size;
	
	public LinkedList() {
		start = null;
		size = 0;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		
		if(start == null) {
			start = node;
		} else {
			Node tmp = start;
			while(tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			
			tmp.setNext(node);
		}
		
		size++;
	}
	public void insert(int data, int position) {
		if( (position < 1) || (position > size) ) {
			System.out.println("Invalid Position");
			return;
		}
		
		Node node = new Node(data);
		
		if(position == 1) {
			node.setNext(start);
			start = node;
		}
		
		Node tmp;
		int i;
		for(i = 2, tmp = start; tmp != null; tmp = tmp.getNext(), i++) {
			if(i == position) {
				node.setNext(tmp.getNext());
				tmp.setNext(node);
				
				size++;
				return;
			}
		}
	}
	
	public void remove(int value) {
		if(start.getData() == value) {
			start = start.getNext();
			size--;
			return;
		}
		
		Node tmp;
		for(tmp = start; tmp != null; tmp = tmp.getNext()) {
			if(tmp.getNext().getData() == value) {
				break;
			}
		}
		
		tmp.setNext(tmp.getNext().getNext());
		size--;
	}
	
	public void removeAtIndex(int position) {
		if(position == 1) {
			start = start.getNext();
			size--;
			return;
		}
		
		Node tmp = start;
		for(int i=0; i<position-1; i++) {
			tmp = tmp.getNext();
		}
		
		tmp.setNext(tmp.getNext().getNext());
		
		size--;
	}
	
	public int getData(int index) {
		Node tmp = start;
		for(int i=0; i<index-1; i++) {
			tmp = tmp.getNext();
		}
		
		return tmp.getData();
	}
	
	public void reverse() {
		Node prev = null;
		Node current = start;
		Node following;
		
		while(current != null) {
			following = current.getNext();
			
			current.setNext(prev);;
			
			prev = current;
			current = following;
		}
	}
	
	public void sort() {
		for(Node i = start; i != null; i = i.getNext()) {
			for(Node j = start.getNext(); j != null; j = j.getNext()) {
				if(i.getData() > j.getData()) {
					int tmp = i.getData();
					i.setData(j.getData());
					j.setData(tmp);
				}
			}
		}
	}
	
	public void print() {
		System.out.print("LinkedList: ");
		
		for(Node tmp = start; tmp != null; tmp = tmp.getNext()) {
			System.out.print(tmp.getData());
			
			if(tmp.getNext() != null) {
				System.out.print(" -> ");
			}
		}
		
		System.out.println();
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		LinkedList singly = new LinkedList();
		
		int choice=0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("1. Insert\n2. Insert at Position\n3. Removal of Node via its value\n4. Removal of Node via its position\n");
			System.out.print("5. Retreival of Particular Node via its index\n6. Reverse\n7. Sorting\n8. Display List\nChoose: ");
			choice = input.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter data: ");
					singly.insert(input.nextInt());
					break;
					
				case 2:
					System.out.print("Enter location: ");
					int tmp = input.nextInt();
					System.out.print("Enter data: ");
					singly.insert(input.nextInt(), tmp);
					break;
					
				case 3:
					System.out.print("Enter value to be removed: ");
					singly.remove(input.nextInt());
					break;
					
				case 4:
					System.out.print("Enter position to be removed: ");
					singly.removeAtIndex(input.nextInt());
					break;
					
				case 5:
					System.out.println("Enter index to get value from: ");
					System.out.println("Value: " + singly.getData(input.nextInt()));
					break;
					
				case 6:
					singly.reverse();
					break;
					
				case 7:
					singly.sort();
					break;
					
				case 8:
					singly.print();
					break;
					
				default:
					choice=0;
			}
			
			System.out.println();
		} while((choice >= 1) && (choice <= 8));
		
		input.close();
	}
}