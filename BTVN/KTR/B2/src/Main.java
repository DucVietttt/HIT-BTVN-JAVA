import java.util.Arrays;
import java.util.Comparator;

class Main{
    public static void main(String[] args) {
        Mobile[] s = new Mobile[5];
        for(int i=0;i<5;i++){
            System.out.println("Nhap thong tin san pham thu " +(i+1));
            Mobile m= new Mobile();
            m.Nhap();
            s[i] = m;
        }
        Arrays.sort(s, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getProduct_price().compareTo(p2.getProduct_price());
            }
        });

        // In danh sách sản phẩm dưới dạng bảng
        System.out.println("Danh sach san pham sap xep theo gia:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s %-10s\n", "ID", "Ten SP", "Gia", "So luong", "Thuong hieu", "Mau");
        for (Product p : s) {
            Mobile m = (Mobile) p;
            System.out.printf("%-10s %-20s %-10.2f %-10d %-10s %-10s\n",
                    m.getProduct_id(),
                    m.getProduct_name(),
                    m.getProduct_price(),
                    m.getProduct_total(),
                    m.getMoblie_manufacturer(),
                    m.getMobile_ram());
        }
    }
}
