import java.util.Scanner;

class Student {
    private String name;
    private int nam_sinh;
    private String address;
    private double tx1;
    private double tx2;
    private double kthp;
    private int buoinghi;

    public Student(String name, int nam_sinh, String address, double tx1, double tx2, double kthp, int buoinghi) {
        this.name = name;
        this.nam_sinh = nam_sinh;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.buoinghi = buoinghi;
    }

    public String getName() {
        return name;
    }

    public int getNam_sinh() {
        return nam_sinh;
    }

    public String getAddress() {
        return address;
    }

    public double getTx1() {
        return tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public int getBuoinghi() {
        return buoinghi;
    }

    public int getAge() {
        return 2024 - nam_sinh;
    }

    public double getGpa() {
        return (tx1 * 0.2) + (tx2 * 0.3) + (kthp * 0.5);
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        nam_sinh = sc.nextInt();
        sc.nextLine();  // Đọc ký tự newline để tránh lỗi khi nhập địa chỉ
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập điểm TX1: ");
        tx1 = sc.nextDouble();
        System.out.print("Nhập điểm TX2: ");
        tx2 = sc.nextDouble();
        System.out.print("Nhập điểm KTHP: ");
        kthp = sc.nextDouble();
        System.out.print("Nhập số buổi nghỉ: ");
        buoinghi = sc.nextInt();
    }
}

public class B1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = nhap.nextInt();
        nhap.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            students[i] = new Student("",0, "", 0.0, 0.0, 0.0, 0);
            students[i].nhapThongTin();
        }
        System.out.printf("%-15s%-10s%-20s%-10s%-10s%-12s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for (Student student : students) {
            System.out.printf("%-15s%-10d%-20s%-10.2f%-10.2f%-12.2f%-10.2f%-12d\n",
                    student.getName(), student.getAge(), student.getAddress(), student.getTx1(), student.getTx2(), student.getKthp(), student.getGpa(), student.getBuoinghi());
        }
    }
}
