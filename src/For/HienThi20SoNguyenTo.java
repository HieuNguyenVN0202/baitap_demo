package For;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố: ");
        int count = 0;

        for (int number = 2; count < 20; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
        }

    }
}
