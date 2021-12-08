package Java_Buoi5_String.JavaClass;

public class DemoReplace {
    public static void main(String[] args) {
        String str = "Nguyễn Văn Nam";
        String result = str.replace("Nam", "Linh").replace('i', 'a');
        System.out.println(result);
    }
}