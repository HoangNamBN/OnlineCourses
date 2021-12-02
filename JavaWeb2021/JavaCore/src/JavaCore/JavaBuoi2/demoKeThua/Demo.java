/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCore.JavaBuoi2.demoKeThua;

/**
 *
 * @author Nam10
 */
public class Demo {

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("D13CNPM5", "Nguyễn Văn Nam", 20);
        System.out.println("Lớp sinh viên: " + sv.getLopHoc());
        System.out.println("Tên sinh viên: " + sv.getHoTen());
        System.out.println("Tuổi sinh viên: " + sv.getTuoi());
    }
}
