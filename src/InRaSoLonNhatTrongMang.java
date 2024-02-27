import java.util.Scanner;

public class InRaSoLonNhatTrongMang {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập 10 phần tử của mảng: ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        int giaTriLonNhat = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > giaTriLonNhat) {
                giaTriLonNhat = array[i];
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + giaTriLonNhat);
    }
}
