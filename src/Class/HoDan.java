package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soNguoi123;
    private int soNha123;
    private Nguoi[] list123; 

    public HoDan() {
        list123 = new Nguoi[10];
    }

    public HoDan(String hoTen123, Date ngaySinh123, String ngheNghiep123, int soNguoi123, int soNha123) {
        super(hoTen123, ngaySinh123, ngheNghiep123);
        this.soNguoi123 = soNguoi123;
        this.soNha123 = soNha123;
    }

    public void nhapThongTin(Scanner sc123) {
        System.out.print("\tNhap so nguoi: ");
        soNguoi123 = sc123.nextInt();
        sc123.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha123 = sc123.nextInt();
        sc123.nextLine();
        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i123 = 0; i123 < soNguoi123; i123++) {
            System.out.println("Nguoi thu " + (i123 + 1) + " la:");
            list123[i123] = new Nguoi();
            list123[i123].nhapThongTin(sc123);
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soNguoi123);
        System.out.println("\tSo nha: " + soNha123);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i123 = 0; i123 < soNguoi123; i123++) {
            System.out.println("Nguoi thu " + (i123 + 1) + " la:");
            list123[i123].hienThiThongTin();
        }
    }

    public Nguoi[] getList123() {
        return list123;
    }

    public int getSoNguoi123() {
        return soNguoi123;
    }
}
