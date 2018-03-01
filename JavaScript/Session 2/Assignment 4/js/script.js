class Stack {
	constructor() {
		this.stack = [];
		this.top = 0;
		this.max = 20;
	}

	get List() {
		return this.stack;
	}
}

Stack.prototype.push = function(value) {
	if(this.top > this.max) {
		alert('Stack Overflow.');
	} else {
		this.stack[this.top++] = value;
	}
};

Stack.prototype.pop = function() {
	if(this.top < 0) {
		alert('Stack Underflow.');
	} else {
		this.stack.splice(this.top-1,1);
		this.top--;
	}
};