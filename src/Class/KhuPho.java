package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> dshd123;

    public KhuPho() {
        dshd123 = new ArrayList<HoDan>(10);
    }

    public void themHoDan(HoDan hoDan123) {
        dshd123.add(hoDan123);
    }

    public void nhapDanhSach(Scanner sc123) {
        HoDan hoDan123;

        System.out.print("Nhap vao so ho dan: ");
        int soHoDan123 = sc123.nextInt();
        sc123.nextLine();

        System.out.println("Nhap vao thong tin cho tung ho dan:");
        for (int i123 = 0; i123 < soHoDan123; i123++) {
            System.out.println("Ho dan thu " + (i123 + 1) + " la:");
            hoDan123 = new HoDan();
            hoDan123.nhapThongTin(sc123);
            themHoDan(hoDan123);
        }
    }

    public void hienThiDanhSach() {
        int n123 = dshd123.size();

        for (int i123 = 0; i123 < n123; i123++) {
            System.out.println("Ho dan thu " + (i123 + 1) + " la:");
            dshd123.get(i123).hienThiThongTin();
        }
    }

    public void timKiemThongTin() {
        Date now123 = new Date();
        int namHienTai123 = now123.getYear() + 1900;

        Nguoi[] dstv123 = null;

        for (HoDan hoDan123 : dshd123) {
            dstv123 = hoDan123.getList123();
            for (int i123 = 0; i123 < hoDan123.getSoNguoi123(); i123++) {
                if (namHienTai123 - (dstv123[i123].getNgaySinh123().getYear() + 1900) == 80) {
                    hoDan123.hienThiThongTin();
                }
            }
        }
    }
}
