package While;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền vay: ");

        double soTienVay = scanner.nextDouble();
        System.out.print("Nhập lãi suất hàng năm (phần trăm): ");

        double laiSuatHangNam = scanner.nextDouble() / 100;
        System.out.print("Nhập số tháng cho vay: ");

        int soThang = scanner.nextInt();
        scanner.close();

        double laiSuatHangThang = laiSuatHangNam / 12;
        double tienTraHangThang = soTienVay * laiSuatHangThang / (1 - Math.pow(1 + laiSuatHangThang, -soThang));

        System.out.println("Số tiền phải trả hàng tháng: " + tienTraHangThang);

        double tongTienTra = tienTraHangThang * soThang;
        double tongLaiSuat = tongTienTra - soTienVay;

        System.out.println("Tổng số tiền trả: " + tongTienTra);
        System.out.println("Tổng số tiền lãi: " + tongLaiSuat);

        int thang = 1;
        while (thang <= soThang) {
            double lai = soTienVay * laiSuatHangThang;
            double gocConLai = tienTraHangThang - lai;
            soTienVay -= gocConLai;
            System.out.println("Tháng " + thang + ": Số tiền lãi trả tháng này: " + lai);
            thang++;
        }
    }
}
