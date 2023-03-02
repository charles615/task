$('#password, #username').on('keyup', function() {


    let password=$('#password').val();
    let username=$('#username').val();



    if(username != "") {
        if(password === "") {
            document.getElementById("submitButton").disabled=true;

        }
        else {
            document.getElementById("submitButton").disabled = false;


        }
    }
    else {
        document.getElementById("submitButton").disabled=true;

    }

});



$("#submitButton").click(function () {

    $.ajax({
        url: "/employee/login",
        type: "POST",
        data: $("#loginForm").serialize(),
        dataType: "JSON",
        success: function (json) {
            if (json.state == 200) {
                alert("Login successfully.")
                location.href = "/web/index.html";
            } else if(json.state == 3001) {
                bootstrapAlert("warning","Password is wrong.")
            } else if(json.state == 3002) {
                bootstrapAlert("warning","Username  not found.")
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