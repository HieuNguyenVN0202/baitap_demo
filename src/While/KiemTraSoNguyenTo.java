package While;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = true;
        int i = 2;

        if (number <= 1) {
            isPrime = false;
        } else {
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
    }
}
