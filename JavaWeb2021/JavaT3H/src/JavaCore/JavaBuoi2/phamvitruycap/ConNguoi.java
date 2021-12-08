package JavaBuoi2.phamvitruycap;

/**
ý nghĩa của phạm vi truy cập (tính đóng gói trong lập trình)
- khi nào dùng private: dùng để che dấu thông tin không cho lớp khác truy cập vào
- khi nào dùng public:
- khi nào dùng protected:
*/
public class ConNguoi {
    private String hoTen;
    private int tuoi;
    
    // Hàm khởi tạo mặc định
    public ConNguoi(){
        hoTen = "Nguyễn Văn Nam";
        tuoi = 20;
    }
    // nạp chồng phương thức
    public ConNguoi(String hoTen, int tuoi){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    
    // hàm getter, setter để lấy và gán dữ liệu
    // Hàm getter, seter cho biến hoTen
    public String gethoTen(){
        return this.hoTen;
    }
    
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
     
}
