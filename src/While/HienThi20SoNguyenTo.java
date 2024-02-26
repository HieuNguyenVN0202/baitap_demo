package While;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("20 số nguyên tố đầu tiên là: ");

        while (count < 20) {
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
                count++;
            }
            number++;
        }
    }
}
