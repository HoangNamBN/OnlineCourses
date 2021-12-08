package JavaBuoi2.demoKeThua;


public class SinhVien extends ConNguoi{
    private String lopHoc;

    public SinhVien() {
    }

    public SinhVien(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public SinhVien(String lopHoc, String hoTen, int tuoi) {
        super(hoTen, tuoi);
        this.lopHoc = lopHoc;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }
}
