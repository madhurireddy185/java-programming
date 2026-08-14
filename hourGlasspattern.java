package day4;
import java.util.Scanner;
public class hourGlasspattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = 0;char alpha = 'Z';
        System.out.println("Enter the limit ");
        limit = scanner.nextInt();
        int mid = limit / 2 + 1;
        for (int row = mid; row >= 1; row--) {
            for (int space = mid; space > row; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column < (row * 2); column++) {
                System.out.print(alpha);
                alpha--;
            }
            System.out.println();
        }
        for (int row = 2; row <= mid; row++) {
            for (int space = mid; space > row; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column < (row * 2); column++) {
                System.out.print(alpha);
                alpha--;
            }
            System.out.println();
        }
        scanner.close();
    }
}
