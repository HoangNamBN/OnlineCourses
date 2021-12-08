package JavaCore.JavaBuoi4_Classes;

public class demoContructor {
    String namePerson;
    int age;
    
    //  khai báo 1 contructor mặc định
    public demoContructor(){
        
    }
    
    // khai báo 3 contructor có tham số 
    public demoContructor(String namePerson){
        this.namePerson = namePerson;
    }
    
    public demoContructor(String namePerson, int age){
        this.namePerson = namePerson;
        this.age = age;
    }
    
    public demoContructor(int age){
        this.age = age;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
    
    public static void main(String[] args) {
        // tạo 1 đối tượng
        demoContructor demo = new demoContructor("Đức Anh");
        System.out.println("Sinh viên: " + demo.getNamePerson());
    }
}
