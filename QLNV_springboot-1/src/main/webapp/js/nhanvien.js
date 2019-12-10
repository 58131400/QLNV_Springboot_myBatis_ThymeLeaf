$(function() {
	$("#login-form").validate({
		onfocusout: true,
		onkeyup: false,
		onclick: false,
		rules: {
			"username": {
				required: true,
				maxlength: 15
			},
			"password": {
				required: true,
				minlength: 2
			}
		},
		messages: {
			"username": {
				required: "* nhập username nào",
				maxlength: "* Hãy nhập tối đa 15 ký tự"
			},
			"password": {
				required: "* Bắt buộc nhập password",
				minlength: "* password gì ngắn thế"
			}
		}
	});
});