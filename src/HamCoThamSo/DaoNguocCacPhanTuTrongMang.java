package HamCoThamSo;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
