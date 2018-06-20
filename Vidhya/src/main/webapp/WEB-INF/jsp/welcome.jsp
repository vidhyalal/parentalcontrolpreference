
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<head>
</head>
<div class="container">
	<form:form name="movieForm" method="POST" action="/movie"
		onsubmit="return validateForm(this)">
		<h1>Welcome ${name}!!</h1>

		<br>
		<h4>
			Please enter movie name &nbsp; <input type="text" name="movie"><br>
			<br> Please select preference &nbsp; <input type="radio"
				name="userOptions" id="U" value="U">U <input type="radio"
				name="userOptions" id="PG" value="PG">PG <input type="radio"
				name="userOptions" id="12" value="12">12 <input type="radio"
				name="userOptions" id="15" value="15">15 <input type="radio"
				name="userOptions" id="18" value="18">18
		</h4>
		<br>
		<p align="center">
			<button type="submit" class="btn btn-success"
				onclick="return check()">Submit</button>
		</p>
	</form:form>
</div>
<script>
	function validateForm(form) {
		var x = form.movie;
		if (x.value == "") {
			alert("Movie Name must be filled out");
			return false;
		}
	}
	function check() {
		if (!validateCheckBoxes()) {
			alert("Please give atleast one preference");
			return false;
		}
	}
	function validateCheckBoxes() {
		var isValid = false;
		var allRows = document.getElementsByName("userOptions");
		for (var i = 0; i < allRows.length; i++) {
			if (allRows[i].checked == true) {
				return true;

			}
		}
		return isValid;
	}
</script>
<%@ include file="common/footer.jspf"%>