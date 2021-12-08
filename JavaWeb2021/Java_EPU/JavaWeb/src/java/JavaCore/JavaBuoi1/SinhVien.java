package JavaCore.JavaBuoi1;

public class SinhVien {
    // khai báo một số properties
    public String idsv;
    public String name;
    public int age;
    public SinhVien(){
        
    }
    public SinhVien(String idsv, String name, int age){
        this.idsv = idsv;
        this.name = name;
        this.age = age;
    }
    
    // method hiển thị
    public void Hienthi(){
        System.out.println("id sv: " + idsv + "; name: " + name + "; age: "+ age);
    }
    
    // tạo ra các hàm getter, setter
    
}
