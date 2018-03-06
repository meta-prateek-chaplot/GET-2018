function removeDuplicate () {
	var input = document.getElementById('data').value;

	for (var i=0; i<input.length-1; i++) {
		if (input[i] == input[i+1]) {
	    	input = input.slice(0, i) + input.slice(i+2);
	      	i = 0;
	    }
	}

	var div = document.createElement('div');

	div.style.border = '1px solid black';
	div.style.display = 'inline-block';
	div.style.margin = '10px';
	div.style.padding = '10px';

	var value = document.createTextNode(input);
	
	div.appendChild(value);
	document.body.appendChild(div);
}