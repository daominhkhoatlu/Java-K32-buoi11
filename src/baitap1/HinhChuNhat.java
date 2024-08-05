package baitap1;

public class HinhChuNhat {
    // buoc 1: khoi tao cac thuoc tinh cua class HinhChuNhat
    private double chieuDai;
    private double chieuRong;

    // ham tao: ten ham phai trung voi ten lop
    // ham tao khong tham so
    public HinhChuNhat() {

    }

    //ham tao co tham so
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // get set
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double dienTich(double chieuDai, double chieuRong) {
        return chieuDai*chieuRong;
    }

    public double chuViHcn(double chieuDai, double chieuRong) {
        return (chieuDai+chieuRong)*2;
    }


}
