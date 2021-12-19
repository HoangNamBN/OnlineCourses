package Java_Buoi5_String.JavaClass;

public class DemoTrim {
    public static void main(String[] args) {
        String str = "      Nguyễn        Văn             Nam         ";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
