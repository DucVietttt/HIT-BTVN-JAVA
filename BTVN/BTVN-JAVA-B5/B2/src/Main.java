public class Main{
    public static void main(String[] args) {
        PhongMay s1=new PhongMay();
        s1.Nhap();
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n","Mã Phòng" , "Tên Phòng","Diện Tích","Mã QL","Họ Tên SV","Mã Máy","Tên Máy","Tình Trạng Máy");
        s1.Xuat();
    }
}