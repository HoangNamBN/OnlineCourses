package Java_Buoi5_String.homework;

public class Bai1 {
    public static void main(String[] args) {
        String str = "     Nguyễn            Văn Nam";
        str = str.trim().replaceAll("\\s+", " ");
        int dem = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                dem++;
            }
        }
        System.out.println("Số từ trong chuỗi " + str + " là: " + dem);
    }
}
