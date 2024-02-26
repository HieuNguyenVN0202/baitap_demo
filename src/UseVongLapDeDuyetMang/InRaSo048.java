package UseVongLapDeDuyetMang;

public class InRaSo048 {
    public static void main(String[] args) {
        System.out.println("Sử dụng vòng lặp for:");
        for (int i = 0; i <= 8; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println("\nSử dụng vòng lặp while:");
        int j = 0;
        while (j <= 8) {
            System.out.print(j + " ");
            j += 4;
        }
    }
}
