package UseVongLapDeDuyetMang;

public class InRaSo0714 {
    public static void main(String[] args) {
        System.out.println("Sử dụng vòng lặp for:");
        for (int i = 0; i <= 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\nSử dụng vòng lặp while:");
        int j = 0;
        while (j <= 100) {
            System.out.print(j + " ");
            j += 7;
        }
    }
}
