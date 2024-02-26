package HamCoThamSo;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng");
        }
    }
}
