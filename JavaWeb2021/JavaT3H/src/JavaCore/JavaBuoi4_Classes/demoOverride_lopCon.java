package JavaBuoi4_Classes;

import java.util.Scanner;

public class demoOverride_lopCon extends demoOverride_LopCha {

    String sex = "Nữ";

    public static void main(String[] args) {
        demoOverride_lopCon demo = new demoOverride_lopCon();
        System.out.println("tuổi: " + demo.age);
        System.out.println("" + demo.name);
        System.out.println("giới tính: " + demo.sex);
    }
}
