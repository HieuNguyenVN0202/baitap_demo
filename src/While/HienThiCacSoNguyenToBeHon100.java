package While;

public class HienThiCacSoNguyenToBeHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");

        int number = 2;
        while (number < 100) {
            boolean isPrime = true;
            int i = 2;

            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
