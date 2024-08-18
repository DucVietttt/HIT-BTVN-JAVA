import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;
    public May(){

    }
    public May(String Ma_may,String Ten_may,String Tinh_trang){
        this.MaMay=Ma_may;
        this.TenMay=Ten_may;
        this.TinhTrang=Tinh_trang;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma may:");
        MaMay=sc.nextLine();
        System.out.println("Nhap ten may:");
        TenMay=sc.nextLine();
        System.out.println("Nhap tinh trang may:");
        TinhTrang=sc.nextLine();
    }
    public void setMaMay(String mamay) {
        this.MaMay = mamay;
    }
    public String getMaMay(){
        return MaMay;
    }
    public String getTenMay() {
        return TenMay;
    }
    public void setTenMay(String tenMay) {
        this.TenMay = tenMay;
    }
    public String getTinhTrang(String tinhTrang){
        return TinhTrang;
    }
    public void Xuat(){
        System.out.printf("%-15s %-15s %-15s  ", MaMay,TenMay,TinhTrang);
    }
}
