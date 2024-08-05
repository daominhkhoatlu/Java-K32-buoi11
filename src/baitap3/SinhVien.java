package baitap3;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLT, diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double tinhDiemTrungBinh() {
        return (this.diemLT * 0.4 + this.diemTH * 0.6);
    }

    public String toString() {
        return "maSV = " + this.maSV +
                ", hoTen = " + this.hoTen +
                ", diemLT = " + this.diemLT +
                ", diemTH = " + this.diemTH;
    }
}
