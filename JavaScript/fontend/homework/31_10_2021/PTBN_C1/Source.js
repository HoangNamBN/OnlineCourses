function check(t, msg){
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



function GiaiPTB1(){
    ta = document.getElementById("tA");
    tb = document.getElementById("tB");
    tResult = document.getElementById("txtKQ")
    if(check(ta, "a") == true && check(tb, "b") == true){
        // ép kiểu
        a = parseFloat(ta.value);
        b = parseFloat(tb.value);
        x = -b/a;
        tResult.value = x;
    }
}