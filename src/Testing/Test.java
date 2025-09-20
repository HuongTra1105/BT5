package Testing;

import java.util.Scanner;
import Class.KhuPho;

public class Test {

    public static void main(String[] args) {
        Scanner sc123 = new Scanner(System.in);

        KhuPho qlkp123 = new KhuPho();

        qlkp123.nhapDanhSach(sc123);

        System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
        qlkp123.timKiemThongTin();

        sc123.close();
    }
}
