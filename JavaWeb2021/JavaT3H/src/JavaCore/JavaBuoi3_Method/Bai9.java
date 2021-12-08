package JavaCore.JavaBuoi3_Method;

import java.util.Scanner;

public class Bai9 {

    public void rutGon() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int ucln = 0;
        // nhập a và b
        do {
            System.out.println("Nhập a= ");
            a = sc.nextInt();
            System.out.println("Nhập b= ");
            b = sc.nextInt();
        } while (a <= 0 || b <= 0);
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }
        a = a / ucln;
        b = b / ucln;
        System.out.println("Phân số sau khi rút gọn là: " + a  + "/"+ b);
    }

    public static void main(String[] args) {
        Bai9 bai9 = new Bai9();
        bai9.rutGon();
    }
}
