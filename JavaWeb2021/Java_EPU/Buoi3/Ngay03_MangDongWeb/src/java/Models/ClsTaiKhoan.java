package Models;

public class ClsTaiKhoan {

    // instance variable: thành phần riêng của từng Object
    String soTK;
    float soDu;

    // statics variable là thành phần chung của một class - mọi đối tượng trong class đều có thể truy cập được
    // cú pháp truy cập: Tên lớp.Static member, không phải tạo đối 
    public static float laiSuat = (float) 0.1;

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
}