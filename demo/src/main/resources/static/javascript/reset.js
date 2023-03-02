$('#password,#username, #phone, #email').on('keyup', function() {
    $('.confirm-message').removeClass('success-message').removeClass('error-message');

    let password=$('#password').val();
    let new_password=$('#newPassword').val();
    let username=$('#username').val();
    let phone=$('#phone').val();
    let email=$('#email').val();


    if(username === "" || email === "" || phone === "" || password === "") {
        document.getElementById("submitButton").disabled=true;
        return false;
    }

    else  {
        document.getElementById("submitButton").disabled = false;
        return true;
    }

});



$("#submitButton").click(function () {

    $.ajax({
        url: "/employee/reset",
        type: "POST",
        data: $("#resetForm").serialize(),
        dataType: "JSON",
        success: function (json) {
            if (json.state == 200) {
                alert("Password changed successfully.")
                location.href = "/web/login.html";
            } else if(json.state == 4001) {
                bootstrapAlert("warning","Details are not correct.")
            }else if(json.state == 4002) {
                bootstrapAlert("warning","Username doesn't exist.")
            }
        },
        error: function (xhr) {
            bootstrapAlert("danger", "Ops, something wrong!");
        }
    });
});
function bootstrapAlert(msg_type, msg_body) {
    var AlertMsg = $('div[role="alert"]');
    $(AlertMsg).find('span').html(msg_body);
    $(AlertMsg).removeAttr('class');
    $(AlertMsg).addClass('alert alert-dismissible alert-' + msg_type);
    $(AlertMsg).fadeIn('fast');
    $(AlertMsg).show();
}