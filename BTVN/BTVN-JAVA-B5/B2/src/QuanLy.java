import java.util.Scanner;
public class QuanLy {
    private String MaQL;
    private String HoTen;
    public QuanLy(){

    }
    public QuanLy(String maQL , String hoTen){
        this.MaQL=maQL;
        this.HoTen=hoTen;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Ma QL:");
        MaQL=sc.nextLine();
        System.out.println("Nhap Ho Ten:");
        HoTen=sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%-15s %-15s ",MaQL,HoTen);
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        this.MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

}
