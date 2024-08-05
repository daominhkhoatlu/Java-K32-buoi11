package baitap3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin cua sinh vien 1: ");
        SinhVien sv1 = new SinhVien();
        System.out.println(sv1);

        System.out.println("Nhap thong tin cho sinh vien 2");
        System.out.print("Nhap maSV: ");
        int maSV = sc.nextInt();

        System.out.print("Nhap tenSV: ");
        String tenSV = sc.next();
        sc.nextLine();
        System.out.print("Nhap diemLT: ");
        double diemLT = sc.nextDouble();
        System.out.print("Nhap diemTH: ");
        double diemTH = sc.nextDouble();

        SinhVien sv2 = new SinhVien();
        sv2.setMaSV(maSV);
        sv2.setHoTen(tenSV);
        sv2.setDiemLT(diemLT);
        sv2.setDiemTH(diemTH);

        System.out.println("diem trung binh: " + sv2.tinhDiemTrungBinh());




    }
}
