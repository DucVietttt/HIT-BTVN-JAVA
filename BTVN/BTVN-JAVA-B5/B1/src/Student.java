
import java.util.Scanner;
 class Student {
    private String Name;
    private String StudentClass;
    private Double Score;
    private Faculty y;
    Scanner sc=new Scanner(System.in);
    public Student() {
        y=new Faculty();
    }
    public Student(String ten, String lop, Double diem) {
        this.Name = ten;
        this.StudentClass=lop;
        this.Score=diem;
    }
     public String getName(){
         return Name;
     }
     public String getStudentClass() {
         return StudentClass;
     }
    public void Nhap(){
        System.out.println("Hay nhap ten sinh vien :");
        Name=sc.nextLine();
        System.out.println("Hay nhap ten lop :");
        StudentClass=sc.nextLine();
        System.out.println("Hay nhap diem :");
        Score=sc.nextDouble();
        y.Nhap();
    }

    public void Xuat(){
        System.out.printf("%-15s %-15s %-15.2f ", Name, StudentClass, Score);
        y.Xuat();
    }
    }

