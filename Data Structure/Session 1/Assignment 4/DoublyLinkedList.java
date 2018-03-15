package assignment_4;

import java.util.Scanner;

class Node {
	protected int data;
	protected Node next;
	protected Node prev;
	
	public Node(int data) {
		this.data = data;
		next = null;
		prev = null;
	}

	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	
	public void setNext(Node link) {
		next = link;
	}
	public Node getNext() {
		return next;
	}
	
	public void setPrev(Node link) {
		prev = link;
	}
	public Node getPrev() {
		return prev;
	}
}

class LinkedList {
	protected Node start;
	protected Node end;
	public int size;
	
	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		
		if(start == null) {
			start = node;
			end = node;
		} else {
			Node tmp = start;
			while(tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			
			tmp.setNext(node);
			
			if(node.getNext() == null) {
				end = node;
			}
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
			
			if(node.getNext() == null) {
				end = node;
			}
			
			return;
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
		
		if(node.getNext() == null) {
			end = node;
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
		
		if(tmp.getNext() == null) {
			end = tmp;
		}
		
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
		
		if(tmp.getNext() == null) {
			end = tmp;
		}
		
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

public class DoublyLinkedList {
	public static void main(String[] args) {
		LinkedList doubly = new LinkedList();
		
		int choice=0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("1. Insert\n2. Insert at Position\n3. Removal of Node via its value\n4. Removal of Node via its position\n");
			System.out.print("5. Retreival of Particular Node via its index\n6. Reverse\n7. Sorting\n8. Display List\nChoose: ");
			choice = input.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter data: ");
					doubly.insert(input.nextInt());
					break;
					
				case 2:
					System.out.print("Enter location: ");
					int tmp = input.nextInt();
					System.out.print("Enter data: ");
					doubly.insert(input.nextInt(), tmp);
					break;
					
				case 3:
					System.out.print("Enter value to be removed: ");
					doubly.remove(input.nextInt());
					break;
					
				case 4:
					System.out.print("Enter position to be removed: ");
					doubly.removeAtIndex(input.nextInt());
					break;
					
				case 5:
					System.out.println("Enter index to get value from: ");
					System.out.println("Value: " + doubly.getData(input.nextInt()));
					break;
					
				case 6:
					doubly.reverse();
					break;
					
				case 7:
					doubly.sort();
					break;
					
				case 8:
					doubly.print();
					break;
					
				default:
					choice=0;
			}
			
			System.out.println();
		} while((choice >= 1) && (choice <= 8));
		
		input.close();
	}
}