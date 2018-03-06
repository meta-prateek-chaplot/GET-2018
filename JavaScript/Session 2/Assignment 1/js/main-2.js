var first = null;

function newNode () {
	var data = document.getElementById('data').value;

	if (data == '') {
		alert('Invalid Input');
	} else {
		var node = new Object();
		node.value = data;
		node.next = null;
		node.prev = null;

		if (first == null) {
			first = node;
		} else {
			var temp = first;

			while (temp.next != null) {
				temp = temp.next;
			}

			node.prev = temp;
			temp.next = node;
		}

		// making input field empty to take up next entry
		document.getElementById('data').value = '';
	}
}

function printForward () {
	var temp = first;

	while (temp != null) {
		var div = document.createElement('div');

		div.style.border = '1px solid black';
		div.style.display = 'inline-block';
		div.style.margin = '10px';
		div.style.padding = '10px';

		var data = document.createTextNode(temp.value);
		div.appendChild(data);

		document.body.appendChild(div);

		temp = temp.next;
	}
}

function printBackward () {
	var temp = first;

	// making temp point to last node
	while(temp.next != null) {
		temp = temp.next;
	}

	while (temp != null) {
		var div = document.createElement('div');

		div.style.border = '1px solid black';
		div.style.display = 'inline-block';
		div.style.margin = '10px';
		div.style.padding = '10px';

		var data = document.createTextNode(temp.value);
		div.appendChild(data);

		document.body.appendChild(div);

		temp = temp.prev;
	}
}