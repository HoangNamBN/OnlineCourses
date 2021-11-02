function check(t ,msg){
    v = t.value;
    if(v == ""){
        alert("Bạn chưa nhập "+ msg);
        t.focus();
        return false;
    }
    if(isNaN(v) == true){
        alert("Bạn phải nhập vào chữ số cho " + msg);
        t.select();
        return false;
    }
    return true;
}


function GiaiPTB1(pheptinh){
    ta = document.getElementById("tA");
    tb = document.getElementById("tB");
    tResult = document.getElementById("txtKQ")
    if(check(ta, "a") == true && check(tb, "b") == true){
        // ép kiểu
        a = parseFloat(ta.value);
        b = parseFloat(tb.value);
        if(pheptinh == "/" && b == 0){
            x = "Cannot divide by zero";
        }
        else{
            // hàm eval là tính và trả về kết quả biểu thức
            x = eval(a + pheptinh + b);
        }
        tResult.value = x;
    }
}