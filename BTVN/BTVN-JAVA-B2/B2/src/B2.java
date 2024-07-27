import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0 && i < n - 1) {
                a[i] = a[i] + (Math.abs(a[i + 1] - a[i - 1]));
            } else if (i % 2 != 0 && i == n - 1) {
                a[i] = a[i] + (Math.abs(0 - a[i - 1]));
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }

    }
}


