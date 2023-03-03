$('#password, #confirmPassword, #username, #phone, #email').on('keyup', function() {
    $('.confirm-message').removeClass('success-message').removeClass('error-message');

    let password=$('#password').val();
    let confirm_password=$('#confirmPassword').val();
    let username=$('#username').val();
    let phone=$('#phone').val();
    let email=$('#email').val();


    if(username === "" || email === "" || phone === "") {
        if(password===""){

            document.getElementById("submitButton").disabled=true;
            return false;
        }

        if(password.length < 6) {
            $('.confirm-message').text("At least 6 password numbers are required.").addClass('error-message');
            document.getElementById("submitButton").disabled=true;
            return false;
        }
        else {
            if(confirm_password===""){
                $('.confirm-message').text("Confirm your password").addClass('error-message');
                document.getElementById("submitButton").disabled=true;
                return false;
            }
            else if(confirm_password===password){
                $('.confirm-message').text('Password Match!').addClass('success-message');
                bootstrapAlert("success", "Password Match!")
                document.getElementById("submitButton").disabled = true;
                return false;
            }
            else{
                bootstrapAlert("warning","Password Doesn't Match!");
                $('.confirm-message').text("Password Doesn't Match!").addClass('error-message');
                document.getElementById("submitButton").disabled=true;
                return false;
                }
        }
    }

    else  {
        if(password===""){

                    document.getElementById("submitButton").disabled=true;
                    return false;
                }

                if(password.length < 6) {
                    $('.confirm-message').text("At least 6 password numbers are required.").addClass('error-message');
                    document.getElementById("submitButton").disabled=true;
                    return false;
                }
                else {
                    if(confirm_password===""){
                        $('.confirm-message').text("Confirm your password").addClass('error-message');
                        document.getElementById("submitButton").disabled=true;
                        return false;
                    }
                    else if(confirm_password===password){
                        $('.confirm-message').text('Password Match!').addClass('success-message');
                        bootstrapAlert("success", "Password Match!")
                        document.getElementById("submitButton").disabled = false;
                        return false;
                    }
                    else{
                        bootstrapAlert("warning","Password Doesn't Match!");
                        $('.confirm-message').text("Password Doesn't Match!").addClass('error-message');
                        document.getElementById("submitButton").disabled=true;
                        return false;
                        }
                }
    }


});



$("#submitButton").click(function () {

    $.ajax({
        url: "/user/signup",
        type: "POST",
        data: $("#signForm").serialize(),
        dataType: "JSON",
        success: function (json) {
            if (json.state == 200) {
                alert("User register successfully.")
                location.href = "/web/login.html";
            } else if(json.state == 2001) {
                bootstrapAlert("warning","Username is used.")
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