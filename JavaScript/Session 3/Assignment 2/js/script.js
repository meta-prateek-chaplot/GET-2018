function popMessage() {
	var carArray = document.getElementsByName('car');
	var car;

	for(var i=0, length=carArray.length; i<length; i++) {
		if(carArray[i].checked) {
			car = carArray[i].value;
			break;
		}
	}

	var colorArray = document.getElementsByName('color');
	var color;

	for(var i=0, length=colorArray.length; i<length; i++) {
		if(colorArray[i].checked) {
			color = colorArray[i].value;
			break;
		}
	}

	alert(car + ' car having ' + color + ' color.');
}