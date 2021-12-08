package JavaBuoi2.phamvitruycap;

import JavaBuoi2.phamvitruycap.ConNguoi;

public class Main {

    public static void main(String[] args) {
        // khai báo biến cn có kiểu dữ liệu là con người
        ConNguoi cn;
        // gọi hàm khởi tạo mặc định
        cn = new ConNguoi();
        // tạo ra một đối tượng con người mới
        ConNguoi cn1 = new ConNguoi("Hà Qúy Đức", 20);
        // tạo ra một đối tượng con người tiếp theo
        ConNguoi cn2 = new ConNguoi();
        cn2.sethoTen("Nguyễn Thị Mỹ Linh");
        System.out.println(cn2.gethoTen());
    }
}