import java.util.Scanner;
class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so chuoi");
        n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            int Dem = 0;
            int dem = 0;
            s[i] = sc.nextLine();
            for (int j = 0; j < s[i].length(); j++) {

                if (s[i].charAt(j) == ' ') {
                    Dem += 1;
                }
            }
            i++;
            s[i] = sc.nextLine();
            for (int k = 0; k < s[i].length(); k++) {

                if (s[i].charAt(k) == ' ') {
                    dem++;
                }
            }
            System.out.println(Dem);
            System.out.println(dem);
        }

    }
}
