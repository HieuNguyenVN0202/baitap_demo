package UseHamKhongThamSo;

public class InRaSoLeTu0Den100 {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        int number = 1;
        while (number <= 100) {
            System.out.println(number);
            number += 2;
        }
    }
}
