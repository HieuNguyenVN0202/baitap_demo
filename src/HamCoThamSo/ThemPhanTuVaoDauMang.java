package HamCoThamSo;

public class ThemPhanTuVaoDauMang {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Old array:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + "   ");
        }

        int[] newArray = addElementToStartArray(originalArray, 0); // Thêm phần tử vào đầu mảng
        System.out.println("\nNew array after adding the element: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "   ");
        }

        int[] newArr = deleteElementFromArray(originalArray, 0); // Xóa 1 phần tử dựa vào index
        System.out.println("\nNew array after delete the element: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "   ");
        }

        findElementInArray(originalArray, 1); // Tìm 1 phần tử trong mảng

    }

    public static int[] addElementToStartArray(int[] arr, int element) {
        int[] result = new int[arr.length + 1];
        result[0] = element;
        System.arraycopy(arr, 0, result, 1, arr.length);
        return result;
    }

    public static int[] deleteElementFromArray(int[] arrs, int index) {
        if (index < 0 || index >= arrs.length) {
            System.out.println("Invalid index. Element not deleted !");
            return arrs;
        }

        int[] result = new int[arrs.length - 1];
        System.arraycopy(arrs, 0, result, 0, index);
        System.arraycopy(arrs, index + 1, result, index, arrs.length - index - 1);
        return result;
    }

    public static int findElementInArray(int[] array, int item) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                found = true;
                System.out.println("\nElement " + item + " has find is " + i);
            }
        }

        if (!found) {
            System.out.println("Not find element in array !");
        }
        return -1;
    }
    // Giải thích: system.arraycopy
    // arr: mảng nguồn
    // 0 : vị trí bắt đầu trong mảng nguồn ( arr ) để sao chép
    // result: mảng đích muốn sao chép đến
    // 1 : vị trí bắt đầu trong mảng đích để sao chép
    // arr.length: số lượng phần tử cần sao chép từ mảng nguồn ( arr ) đến mảng đích ( result )
}
