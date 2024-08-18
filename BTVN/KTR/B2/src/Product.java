import java.util.Scanner;

class Product {
    private String product_id;
    private String product_name;
    private Double product_price;
    private int product_total;
    public Product(){

    }
    public Product(String Dinh_danh,String Ten_SP,Double Gia_SP,int So_luong ){
        this.product_id=Dinh_danh;
        this.product_name=Ten_SP;
        this.product_price=Gia_SP;
        this.product_total=So_luong;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Ma Dinh Danh :");
        product_id=sc.nextLine();
        System.out.println("Nhap ten SP:");
        product_name=sc.nextLine();
        System.out.println("Nhap Gia SP:");
        product_price=sc.nextDouble();
        System.out.println("Nhap so luong SP:");
        product_total=sc.nextInt();
    }
    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public int getProduct_total() {
        return product_total;
    }

    public void setProduct_total(int product_total) {
        this.product_total = product_total;
    }
    public Double getTotalPrice(){
        return product_price * product_total;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Ma Dinh Danh : " + product_id + '\'' +
                ", Ten SP:" + product_name + '\'' +
                ", Gia SP:" + product_price +
                ", So Luong SP:" + product_total +
                '}';
    }
}
