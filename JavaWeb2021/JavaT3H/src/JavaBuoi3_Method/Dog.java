package JavaBuoi3_Method;

public class Dog extends Animal{
    // khi không khai báo phạm vi truy cập cho thuộc tính
    // thì mặc định sẽ là private
    public String tenDog;
    float diemTB;
    
    // hàm contructor: hàm khởi không tham số 
    // hay được gọi là hàm khởi tạo mặc định
    public Dog(){
    }
    
    // nạp chồng phương thức 
    public Dog(String nameDog){
        // this để chỉ đây là biến của class
        // còn tenDog còn lại là giá trị truyền vào
        this.tenDog = nameDog;
    } 
    
    @Override
    public void HienThi(){
        System.out.println("Tiếng kêu của Đức ...");
    }
}
