class Node {
	constructor(value) {
		this.data = value;
		this.next = null;
	}

	get Data() {
		return this.data;
	}

	get Next() {
		return this.next;
	}

	set Next(link) {
		this.next = link;
	}
}

class Queue {
	constructor() {
		this.front = null;
		this.rear = null;
		this.size = 30;
		this.length = 0;
	}

	isEmpty() {
		return this.front == null;
	}

	isFull() {
		return this.rear == this.size;
	}

	get getList() {
		var ptr = this.front;
		var array = [];

		while(ptr != null) {
			array.push(ptr.Data);
			ptr = ptr.Next;
		}

		return array;
	}
}

Queue.prototype.enqueue = function(val) {
	var link = new Node(val);

	if(this.isEmpty()) {
		this.length++;
		this.front = this.rear = link;
	} else if(this.isFull()) {
		alert('Queue is Full.');
	} else {
		this.rear.Next = link;
		this.rear = link;
		this.length++;
	}
};

Queue.prototype.dequeue = function() {
	if(this.isEmpty()) {
		alert('Queue is Empty.');
	} else {
		this.front = this.front.Next;
		this.length--;
	}
};