function popMessage() {
	var radioOption = document.getElementsByName('dropDown');

	for(var i=0, length=radioOption.length; i<length; i++) {
		if(radioOption[i].checked) {
			var dropDown;
			var value;

			if(radioOption[i].value == 'first') {
				dropDown = document.getElementById('firstBox');
				value = dropDown.options[dropDown.selectedIndex].value;
				console.log(value);
			} else {
				dropDown = document.getElementById('secondBox');
				value = dropDown.options[dropDown.selectedIndex].value;
				console.log(value);
			}
		}
	}
}