package For;

public class TimUocChungLonNhat {
    public static void main(String[] args) {

        int number1 = 48, number2 = 36;
        int maxUCLN = 1;

        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                maxUCLN = i;
            }
        }

        System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + maxUCLN);
    }
}
