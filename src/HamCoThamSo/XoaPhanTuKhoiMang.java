package HamCoThamSo;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 2, 8, 4};
        int elementToRemove = 9;

        int newSize = arr.length - 1;
        int[] newArr = new int[newSize];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                newArr[index] = arr[i];
                index++;
            }
        }

        System.out.println("Mảng mới sau khi xóa phần tử: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
