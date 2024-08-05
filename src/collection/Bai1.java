package collection;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<String> thanhPho = new ArrayList<>();
        thanhPho.add("Hanoi");
        thanhPho.add("Danang");
        thanhPho.add("TPHCM");
        System.out.println("list thanh pho: " + thanhPho);

        thanhPho.add("Khanh Hoa");
        thanhPho.add("Thanh Hoa");
        System.out.println("list thanh pho 2: " + thanhPho);

        thanhPho.remove(1);
        System.out.println("thanh pho sau khi xoa : " + thanhPho);
    }
}
