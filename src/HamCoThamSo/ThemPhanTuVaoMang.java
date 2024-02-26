package HamCoThamSo;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int newItem = 12;

        int newSize = arr.length + 1;
        int[] newArr = new int[newSize];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[newSize - 1] = newItem;

        System.out.println("\nMảng mới sau khi thêm phần tử: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
