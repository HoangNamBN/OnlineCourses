package Java_Buoi5_String.JavaClass;

public class DemoCompareTo {
    public static void main(String[] args) {
        String str1 = "Nguyễn Thị Mỹ Linh";
        String str2 = "Nguyễn Văn Nam";
        int result = str1.compareTo(str2);
        if(result < 0){
            System.out.println("Chuỗi " + str1 + " < " + str2);
        } else if(result == 0){
            System.out.println("Chuỗi " + str1 + " = " + str2);
        } else{
            System.out.println("Chuỗi " + str1 + " > " + str2);
        }
    }
}
