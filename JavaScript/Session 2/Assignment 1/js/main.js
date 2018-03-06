var first = null;

function newNode () {
	var data = document.getElementById('data').value;

	if (data == '') {
		alert('Input List Value.');
	} else {
		var node = new Object();
		node.value = data;
		node.next = null;

		if (first == null) {
			first = node;
		} else {
			var temp = first;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = node;
		}

		// making text-box value empty for re-entry
		document.getElementById('data').value = '';
	}
}

function printList () {
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