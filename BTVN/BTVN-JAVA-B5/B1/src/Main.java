import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so luong sinh vien:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        Student s1[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin SV thu " + (i + 1));
            s1[i]=new Student();
            s1[i].Nhap();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sinh vien thu 1 la: ");
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Ten SV", "Lop", "Diem", "Ten Khoa", "Ngay Vao Khoa", "Ten Truong", "Ngay Vao Truong");
            s1[i].Xuat();
        }
    }
}