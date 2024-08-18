import java.util.Scanner;
public class PhongMay {
    private  String MaPhong;
    private String TenPhong;
    private Double DienTich;
    private QuanLy x;
    private May[] y;
    private int n;
    public PhongMay(){
        x=new QuanLy();
        y=new May[1];
    }
    public PhongMay(String MaPhong,String TenPhong,Double DienTich,int n){
        this.MaPhong=MaPhong;
        this.TenPhong=TenPhong;
        this.DienTich=DienTich;
        this.n=y.length;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma phong:");
        MaPhong=sc.nextLine();
        System.out.println("Nhap Ten Phong:");
        TenPhong=sc.nextLine();
        System.out.println("Nhap Dien Tich:");
        DienTich=sc.nextDouble();
        x.Nhap();
        System.out.println("Nhap so may: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            y[i]=new May();
            y[i].Nhap();
        }
    }

    public void Xuat(){
        System.out.printf("%-15s %-15s %-15s",MaPhong,TenPhong,DienTich);
        x.Xuat();
        for(int i=0;i<n;i++){
            y[i].Xuat();
        }
    }
    public String getMaPhong() {
        return MaPhong;
    }
    public void setMaPhong(String maPhong) {
        this.MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.TenPhong = tenPhong;
    }

    public Double getDienTich() {
        return DienTich;
    }

    public void setDienTich(Double dienTich) {
        this.DienTich = dienTich;
    }
}
