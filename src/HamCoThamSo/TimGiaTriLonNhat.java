package HamCoThamSo;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 2, 8, 10, 4};

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
    }
}
