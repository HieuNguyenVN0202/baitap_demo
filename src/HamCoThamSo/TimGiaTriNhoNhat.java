package HamCoThamSo;

import java.util.Arrays;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 2, 8, 4};
        // .stream là tạo 1 luồng các phần tử từ mảng
        // .min là để tìm giá trị nhỏ nhất
        int minValue = Arrays.stream(arr).min().getAsInt();

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}
