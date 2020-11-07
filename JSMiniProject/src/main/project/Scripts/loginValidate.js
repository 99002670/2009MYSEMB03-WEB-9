function showErr(ele, msg) {
	document.getElementById(ele).innerText = msg;
}
function loginValidate() {
	let email = document.regForm.email.value;
	let password = document.regForm.password.value;

	if (email == "") {
		showErr("errEmail", "Email is mandatory");
		return false;
	} else {
		showErr("errEmail", "");
	}

	let regEx = new RegExp("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
	if (!regEx.test(email)) {
		showErr("errEmail", "Email is not in a valid format");
		return false;
	} else {
		showErr("errEmail", "");
	}

	if (password == "") {
		showErr("errPassword", "Password is mandatory");
		return false;
	} else {
		showErr("errPassword", "");
	}

	return true;
}