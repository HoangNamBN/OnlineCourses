package JavaCore.JavaBuoi2.demoNhapXuat;

import java.util.Scanner;

// nhập vào 2 số a và b và tính tổng. hiệu, tích, thương
public class demoNhap {

    public float Nhap() {
        Scanner scanner = new Scanner(System.in);
        float n;
        while (true) {
            try {
                n = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Nhập lại đi em!");
                scanner.nextLine();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        demoNhap deNhap = new demoNhap();
        System.out.println("Nhập vào số a = ");
        float a = deNhap.Nhap();
        System.out.println("Nhập vào số b = ");
        float b = deNhap.Nhap();
        System.out.println("Tổng 2 số là: " + (a + b));
    }
}
