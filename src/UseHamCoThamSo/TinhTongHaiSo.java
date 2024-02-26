package UseHamCoThamSo;

public class TinhTongHaiSo {
    public static void main(String[] args) {
        int soThuNhat = 5;
        int soThuHai = 3;
        int tong = tinhTong(soThuNhat, soThuHai);
        inKetQuaTong(tong);
    }

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static void inKetQuaTong(int tong) {
        System.out.println("Kết quả tổng của hai số là: " + tong);
    }
}
