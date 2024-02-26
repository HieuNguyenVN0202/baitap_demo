package While;

public class HienThiCacHinh {
    public static void main(String[] args) {
        System.out.println("Hình chữ nhật:");
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 10) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Hình tròn:");
        int r = 5;
        int x = 0;
        while (x <= 2 * r) {
            int y = 0;
            while (y <= 2 * r) {
                if ((int) Math.sqrt((x - r) * (x - r) + (y - r) * (y - r)) == r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                y++;
            }
            System.out.println();
            x++;
        }

        System.out.println("Hình vuông:");
        int k = 1;
        while (k <= 5) {
            int l = 1;
            while (l <= 5) {
                System.out.print("* ");
                l++;
            }
            System.out.println();
            k++;
        }
    }
}
