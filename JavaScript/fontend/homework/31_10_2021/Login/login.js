function check() {
    user = document.getElementById("tUser");
    pass = document.getElementById("tPass");
    userError = document.getElementById("UserError");
    passError = document.getElementById("PassError");

    if (user.value == "") {
        // chèn HTML vào thẻ id=UserError
        userError.innerHTML = "<i>Chưa nhập UserName</i>";
        userError.style.color = "red";
    }
    else {
        userError.innerHTML = "<i>Thành công</i>";
        userError.style.color = "blue";
    }
    if (pass.value == "") {
        passError.innerHTML = "<i>Chưa nhập Password</i>";
        passError.style.color = "red";
    }
    else {
        if (pass.value.length < 6) {
            passError.innerHTML = "<i>Mật khẩu phải lớn hơn hoặc bằng 6 kí tự</i>";
            passError.style.color = "red";
        }
        else {
            passError.innerHTML = "<i>Thành công</i>";
            passError.style.color = "blue";
        }
    }
}