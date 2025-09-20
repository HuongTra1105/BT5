package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen123;
    private Date ngaySinh123;
    private String ngheNghiep123;

    public Nguoi() {

    }
    public Nguoi(String hoTen123, Date ngaySinh123, String ngheNghiep123) {
        this.hoTen123 = hoTen123;
        this.ngaySinh123 = ngaySinh123;
        this.ngheNghiep123 = ngheNghiep123;
    }
    public void nhapThongTin(Scanner sc123) {
        System.out.print("\tNhap ho ten: ");
        hoTen123 = sc123.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate123 = sc123.nextLine();
        ngaySinh123 = strToDate(strDate123);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep123 = sc123.nextLine();
    }
    private Date strToDate(String strDate123) {
        Date date123 = null;
        SimpleDateFormat sdf123 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date123 = sdf123.parse(strDate123);
        } catch (ParseException e123) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date123;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen123);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh123));
        System.out.println("\tNghe nghiep: " + ngheNghiep123);
    }

    private String dateToString(Date date123) {
        SimpleDateFormat sdf123 = new SimpleDateFormat("dd-MM-yyyy");
        String strDate123 = sdf123.format(date123);
        return strDate123;
    }

    public Date getNgaySinh123() {
        return ngaySinh123;
    }
}
