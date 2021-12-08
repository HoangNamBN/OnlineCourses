package Java_Buoi5_String.JavaClass;

// input: Nguyễn Văn Nam
// output: Vị trí index xuất hiên chữ V đầu tiên

public class DemoIndexOf_LastIndexOf {
    public static void main(String[] args) {
        String str = "Nguyễn Văn Nam";
        // trả về vị trí đầu tiên xuất hiện kí tự V
        int result = str.indexOf('V');
        System.out.println(result);

        // trả về vị trí cuối cùng xuất hiện kí tự n
        int result1 = str.lastIndexOf('n');
        System.out.println(result1);
    }
}
