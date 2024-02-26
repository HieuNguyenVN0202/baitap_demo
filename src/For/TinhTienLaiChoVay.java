package For;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double tienGui = 1.0;

        int thang = 1;

        double laiSuat = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số tiền: ");
        tienGui = input.nextDouble();

        System.out.println("Nhập tháng: ");
        thang = input.nextInt();

        System.out.println("Nhập lãi suất: ");
        laiSuat = input.nextDouble();

        double tongTienLai = 0;
        for(int i = 0; i < thang; i++){
            tongTienLai += tienGui * (laiSuat/100)/12 * thang;
        }

        System.out.println("Tiền lãi: " + tongTienLai);
    }
}
