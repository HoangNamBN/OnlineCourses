package Java_Buoi5_String.JavaClass;

public class DemoEquals {
    public static void main(String[] args) {
        String str1 = "Nguyễn Thị Mỹ Linh";
        String str2 = "Nguyễn Văn Nam";
        if(str1.equals(str2) == true) {
            System.out.println("Chuỗi " + str1 + " = " + str2);
        }else{
            System.out.println("Chuỗi " + str1 + " khác " + str2);
        }
    }
}

// so sánh equals với dấu ==
// dấu "==" là 1 toán tử, kiểm tra 2 biến có cùng trỏ vào 1 bộ nhớ hay không
// equals là 1 phương thức dùng để só sánh giá trị của 2 biến.