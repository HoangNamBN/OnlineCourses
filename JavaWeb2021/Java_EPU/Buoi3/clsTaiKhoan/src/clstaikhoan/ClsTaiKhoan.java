package clstaikhoan;

public class ClsTaiKhoan {

    // instance variable: thành phần riêng của từng Object
    String soTK;
    float soDu;

    // statics variable là thành phần chung của một class - mọi đối tượng trong class đều có thể truy cập được
    // cú pháp truy cập: Tên lớp.Static member, không phải tạo đối 
    static float laiSuat = (float) 0.0;

    public ClsTaiKhoan() {
    }

    public ClsTaiKhoan(String soTK, float soDu) {
        this.soTK = soTK;
        this.soDu = soDu;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public float getSoDu() {
        return soDu;
    }

    public void setSoDu(float soDu) {
        this.soDu = soDu;
    }

    public static float getLaiSuat() {
        return laiSuat;
    }

    public static void setLaiSuat(float laiSuat) {
        ClsTaiKhoan.laiSuat = laiSuat;
    }

    public void hienThi() {
        System.out.println("Số tài khoản: " + this.soTK);
        System.out.println("Số dư: " + this.soDu);
        System.out.println("Lãi suất: " + (this.soDu * laiSuat));
    }

    // hàm static chỉ được phép truy cập vaò các member khác
    // không được truy cập vào các non static member
    public static void hienThiThongTin() {
        System.out.println("Lãi suất: " + laiSuat);
    }

    public static void main(String[] args) {
        // khi truy cạpa biến thì không cần tạo đối tượng
        ClsTaiKhoan.laiSuat = 0.1f;
        // tạo các đối tượng từ clsTaiKhoan để truy cập
        // mỗi object (instace of class)
        ClsTaiKhoan tk = new ClsTaiKhoan("0001", 100000);
        ClsTaiKhoan tk1 = new ClsTaiKhoan();
        tk1.soTK = "0002";
        tk1.soDu = 2000000;
        tk.hienThi();
        tk1.hienThi();
        hienThiThongTin();
    }

}
