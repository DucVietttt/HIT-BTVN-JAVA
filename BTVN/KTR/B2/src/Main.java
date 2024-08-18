class Main{
    public static void main(String[] args) {
        Product s=new Product();
        s.Nhap();
        System.out.println(s);
        System.out.println("Tong gia tri san pham la " + s.getTotalPrice());
    }
}