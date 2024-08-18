import java.util.Scanner;

class Mobile extends Product {
    private String moblie_manufacturer;
    private int mobile_ram;
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thuong hieu:");
        moblie_manufacturer= sc.nextLine();
        System.out.println("Nhap mau:");
        mobile_ram = sc.nextInt();
    }
    public Mobile(){

    }
    public Mobile(String Dinh_danh, String Ten_SP, Double Gia_SP, int So_luong, String HangSX, int  Bonho) {
        super(Dinh_danh, Ten_SP, Gia_SP, So_luong);
        this.moblie_manufacturer = HangSX;
        this.mobile_ram= Bonho;
    }


    public String getMoblie_manufacturer() {
        return moblie_manufacturer;
    }

    public void setMoblie_manufacturer(String moblie_manufacturer) {
        this.moblie_manufacturer = moblie_manufacturer;
    }

    public int getMobile_ram() {
        return mobile_ram;
    }

    public void setMobile_ram(int mobile_ram) {
        this.mobile_ram = mobile_ram;
    }
    public Double getTotalPrice(){
        return getTotalPrice() + 0,2*
    }
    @Override
    public String toString() {
        return "Mobile{" +
                "Ma Dinh Danh'" + getProduct_id() + '\'' +
                ", Ten SP" + getProduct_name() + '\'' +
                ", Gia SP" + getProduct_price() +
                ", So luong" + getProduct_total() +
                ", HangSX" + moblie_manufacturer+ '\'' +
                ", Bonho" +mobile_ram+ '\'' +
                '}';
    }
}
