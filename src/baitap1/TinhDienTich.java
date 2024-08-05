package baitap1;

public class TinhDienTich {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5.2,4);
        System.out.println("Dien tich hinh chu nhat la: " + hcn.dienTich(hcn.getChieuDai(), hcn.getChieuRong()));
        System.out.println("chu vi hinh chu nhat la: " + hcn.chuViHcn(hcn.getChieuDai(), hcn.getChieuRong()));
    }
}
