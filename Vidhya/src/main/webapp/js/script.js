function validateForm(form) {
    var x = form.movie;
    if (x.value == "") {
        alert("Movie Name must be filled out");
        return false;
    }
}