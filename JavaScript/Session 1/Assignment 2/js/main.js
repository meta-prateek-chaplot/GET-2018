function cityFunc() {
	var city = document.contact.city;
	var citybox = document.getElementById('city-box');

	citybox.style.display = "table-row";
	document.contact.cityText.value = "You have selected: " + city.value;
}

function formValidation () {
	// checking name
	var name = document.contact.name;
	var checkName = /^[A-Za-z ]{3,20}$/;

	if(checkName.test(name.value) == false) {
		alert('Invalid Name');
		return false;
	}

	// checking email
	var email = document.contact.email;
	var checkEmail =  /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;

	if(checkEmail.test(email.value) == false) {
		alert('Invalid Email');
		return false;
	}

	// checking organization-name
	var organizationName = document.contact.organization;
	var checkOrganization = /^[A-Za-z]+$/;

	if(checkOrganization.test(organizationName.value) == false) {
		alert('Invalid Organization Name');
		return false;
	}

	// checking contact-number
	var contactNumber = document.contact.number;
	var checkContactNumber = /^[0-9]{10}$/;

	if(checkContactNumber.test(contactNumber.value) == false) {
		alert('Invalid Contact Number');
		return false;
	}

	// checking textarea
	var textarea = document.contact.textarea;
	var checkTextarea = /^.{0,250}$/;

	if(checkTextarea.test(textarea.value) == false) {
		alert('Invalid textarea\nMessage should be less than 250 words');
		return false;
	}

	return true;
}