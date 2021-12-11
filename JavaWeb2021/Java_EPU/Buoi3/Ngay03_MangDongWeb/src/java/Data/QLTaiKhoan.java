package Data;

import Models.ClsTaiKhoan;
import java.util.ArrayList;
import java.util.Vector;

public class QLTaiKhoan {

    // có thể sử dụng mảng động dạng ArrayList hoặc Vector
    ArrayList<ClsTaiKhoan> listTK = new ArrayList<>();
    public Vector<ClsTaiKhoan> list2TK = new Vector<>();

    // có thể không cần truyền đối tượng kiểu dữ liệu vào cũng được 
    // có nghĩa là truyền mọi đối tượng vào đều được
    //    ArrayList listTK1 = new ArrayList();
    //    Vector list2TK1 = new Vector();

    public Vector<ClsTaiKhoan> getList2TK() {
        return list2TK;
    }

    public void setList2TK(Vector<ClsTaiKhoan> list2TK) {
        this.list2TK = list2TK;
    }

    public QLTaiKhoan() {

    }

    public void getData() {
        ClsTaiKhoan.laiSuat = 0.1f;
        // giả sử khởi tạo 3 đối tượng của Cls TaiKhoan và đưa vào mảng
        ClsTaiKhoan clstk1 = new ClsTaiKhoan("001", 10000000);
        ClsTaiKhoan clstk2 = new ClsTaiKhoan("002", 20000000);

        list2TK.add(clstk1);
        list2TK.add(clstk2);
        list2TK.add(new ClsTaiKhoan("003", 30000000));
    }

}
