package BaiTap2702;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập 10 phần tử của mảng: ");
        for (int i = 0; i < 10; i++) {
            arrays[i] = scanner.nextInt();
        }

        int giaTriLonNhat = timGiaTriLonNhat(arrays);
        System.out.println("Giá trị lớn nhất trong mảng là: " + giaTriLonNhat);

    }

    public static int timGiaTriLonNhat(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }
}
