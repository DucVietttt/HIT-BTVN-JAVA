import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x;
    public Faculty(){
        x = new School();
    }
    Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.println("Nhap ten truong :");
        x.setName(sc);
        System.out.println("Nhap ngay vao truong :");
        x.setDate(sc);
        System.out.println("Nhap ten Khoa : ");
        Name=sc.nextLine();
        System.out.println("Nhap ngay vao Khoa: ");
        Date = sc.nextLine();
    }
    public Faculty(String TenKhoa,String Ngayvao){
        this.Name=TenKhoa;
        this.Date=Ngayvao;
    }
    public String getName(){
        return Name;
    }
    public String getDate(){
        return Date;
    }
    public void setName(String ten){
        this.Name=ten;
    }
    public void setDate(String ngay){
        this.Date=ngay;
    }
    public void Xuat(){
        System.out.printf("%-15s %-15s %-15s %-15s", x.getName(), x.getDate(), Name, Date);
    }
}
