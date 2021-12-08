package Java_Buoi5_String.JavaClass;

public class LenghtString_Concat {
    public static void main(String[] args) {
        // cú pháp khai báo 1 chuỗi
        String str = "Hello-world ";

        // tạo 1 đối tương string
        String str1 = new String("Gíá trị 1");

        // các hàm xử chuỗi
        // 1. xác định độ dài chuỗi
        int lenght = str.length();
        System.out.println("Độ dài chuỗi : " + str + " là: " + lenght);


        // 2. Hàm nối chuỗi
        String str2 = str.concat(str1);
        System.out.println(str2);
        System.out.println("Độ dài của chuỗi 2: " + str2.length());
    }
}
