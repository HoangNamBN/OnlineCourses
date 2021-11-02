// khai báo function: function (tên hàm) { ... }
// Gọi hàm
function Hello(){
    window.alert("Hello - Function - JavaScript");
}
function sum(a, b){
    return a+ b;
}

// cách 1
function kiemtra()
{
    alert("Hàm kiểm tra user, password");
    //truy cập thông qua cấu DOM (Document Object Model)
    //document.formName.inputName.value để lấy hay gán giá trị cho input
    user = document.form1.tUser.value;
    pass = document.form1.tPass.value;
    if(user=="" || pass=="")
    {
        alert("Bạn chưa nhập user và password");
        // đặt con trỏ nhập liệu vào text user
        document.form1.tPass.focus();
        // lệnh return xử lý. Nếu xử lý thì hủy sự kiện click nếu xử lý trả về false
        // Nếu không có return thì dù đúng hay sai vẫn chạy tiếp
        return false;
    }
    else
        // alert("OK");
        // return true;
        alert("Username: " + user + ", Password:  " + pass);
}

// cách 2

function kiemtraC2(){
    // truy cập trực tiếp qua id
    user = document.getElementById("tUser").value; // gán tham chiếu
    pass = document.getElementById("tPass").value;
    if(user.value == "" || pass.value =="")
    {
        alert("Bạn chưa nhập user và password");
        // đặt con trỏ nhập liệu vào text user
        user.focus();
        // lệnh return xử lý. Nếu xử lý thì hủy sự kiện click nếu xử lý trả về false
        // Nếu không có return thì dù đúng hay sai vẫn chạy tiếp
        return false;
    }
    else
        // alert("OK");
        // return true;
        alert("Username: " + user + ", Password:  " + pass);
}


function xuly()
{
	//truy cập trực tiếp qua ID
	//document.getElementById("id của thẻ");
	user = document.getElementById("tUser");//gán tham chiếu tới thẻ có id=t1
	pass = document.getElementById("tPass");//gán tham chiếu tới thẻ có id=t2
	if(user.value=="")
	{
		alert("Chưa nhập user");
		user.focus();//đặt con trỏ nhập liệu vào t1
		return false;
	}
	if(pass.value=="")
	{
		alert("Chưa nhập password");
		pass.focus();
		return false;
	}
	if(pass.value.length <6)
	{
		alert("Mật khẩu phải >=6 ký tự");
		pass.select();//bôi đen nội dung của t2
		return false;
	}
	alert("OK");
	return true;
}
