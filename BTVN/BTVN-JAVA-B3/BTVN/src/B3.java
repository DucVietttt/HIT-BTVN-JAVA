import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        int  a = (int) (Math.random() * 11);
        int  b = (int) (Math.random() * 11);
        int c = (int) (Math.random() * 21);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println("Nhap Y neu phep tinh dung con N neu phep tinh sai:");
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        if (a + b == c && S.equalsIgnoreCase("Y")) {
            System.out.println("true");
        } else if (a + b != c && S.equalsIgnoreCase("N")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
