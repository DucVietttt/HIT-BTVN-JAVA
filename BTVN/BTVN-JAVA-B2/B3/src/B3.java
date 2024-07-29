import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

    int c1 = 0, c2 = n - 1, h1 = 0, h2 = n - 1, gt = 1;
    while(c1<=c2 &&h1<=h2)
    {
        for (int i = c1; i <= c2; i++) {
            a[h1][i] = gt;
            gt++;
        }
        h1++;
        for (int i = h1; i <= h2; i++) {
            a[i][c2] = gt;
            gt++;
        }
        c2--;
        if (c1 <= c2) {
            {
                for (int i = c2; i >= c1; i--) {
                    a[h2][i] = gt;
                    gt++;
                }
            }
            h2--;
        }
        if (h1 <= h2) {
            {
                for (int i = h2; i >= h1; i--) {
                    a[i][c1] = gt;
                    gt++;
                }
            }
            c1++;
        }
    }
         for(int i = 0; i<n;i++)
    {
        for (int j = 0; j < n; j++) {
            System.out.printf("%d ", a[i][j]);
        }
        System.out.println("");
    }
}
    }

