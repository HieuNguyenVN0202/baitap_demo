package While;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int number1 = 12, number2 = 36;
        int maxUCLN = 1;
        int i = 1;

        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                maxUCLN = i;
            }
            i++;
        }

        System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + maxUCLN);
    }
}
