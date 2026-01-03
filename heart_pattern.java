import java.util.*;
public class heart_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Enter the size = ");
        int size = sc.nextInt();

        for (x = size / 2; x <= size; x += 2) {
            for (y = 1; y < (size - x); y += 2) {
                System.out.print(" ");
            }
            for (y = 1; y <= x; ++y) {
                System.out.print("*");
            }
            for (y = 1; y <= (size - x); ++y) {
                System.out.print(" ");
            }
            for (y = 1; y <= x; ++y) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (x = size; x >= 1; --x) {
            for (y = x; y < size; ++y) {
                System.out.print(" ");
            }
            for (y = 1; y <= (x * 2) - 1; ++y) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
