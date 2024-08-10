import java.util.Scanner;

class SinhVien {
    private String ten;
    private int namSinh;
    private String diaChi;
    private double diemTX1;
    private double diemTX2;
    private double diemKTHP;
    private int soBuoiNghi;

    public SinhVien() {
    }

    public SinhVien(String ten, int namSinh, String diaChi, double diemTX1, double diemTX2, double diemKTHP, int soBuoiNghi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemKTHP = diemKTHP;
        this.soBuoiNghi = soBuoiNghi;
    }

    public String getTen() {
        return ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getDiemTX1() {
        return diemTX1;
    }

    public double getDiemTX2() {
        return diemTX2;
    }

    public double getDiemKTHP() {
        return diemKTHP;
    }

    public int getSoBuoiNghi() {
        return soBuoiNghi;
    }

    public int getTuoi() {
        return 2024 - namSinh;
    }

    public double getGPA() {
        return (diemTX1 * 0.2) + (diemTX2 * 0.3) + (diemKTHP * 0.5);
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập điểm TX1: ");
        diemTX1 = sc.nextDouble();
        System.out.print("Nhập điểm TX2: ");
        diemTX2 = sc.nextDouble();
        System.out.print("Nhập điểm KTHP: ");
        diemKTHP = sc.nextDouble();
        System.out.print("Nhập số buổi nghỉ: ");
        soBuoiNghi = sc.nextInt();
    }

    public void xuatThongTin() {
        System.out.printf("%-15s%-10d%-20s%-10.2f%-10.2f%-12.2f%-10.2f%-12d\n",
                ten, getTuoi(), diaChi, diemTX1, diemTX2, diemKTHP, getGPA(), soBuoiNghi);
    }
}

public class B1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSinhVien = nhap.nextInt();
        nhap.nextLine();
        SinhVien[] danhSachSinhVien = new SinhVien[soLuongSinhVien];

        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            danhSachSinhVien[i] = new SinhVien();
            danhSachSinhVien[i].nhapThongTin();
        }

        while (true) {
            System.out.println("----------MENU----------");
            System.out.println("1. Thêm sinh viên mới.");
            System.out.println("2. Sửa thông tin sinh viên.");
            System.out.println("3. Sắp xếp theo tuổi.");
            System.out.println("4. Sắp xếp theo GPA.");
            System.out.println("5. Sắp xếp theo Số buổi nghỉ.");
            System.out.println("6. Xóa sinh viên.");
            System.out.println("7. Hiển thị danh sách sinh viên.");
            System.out.println("0. Thoát.");
            System.out.print("Nhập lựa chọn: ");
            int luaChon = nhap.nextInt();

            switch (luaChon) {
                case 1:
                    soLuongSinhVien++;
                    SinhVien[] danhSachMoi = new SinhVien[soLuongSinhVien];
                    System.arraycopy(danhSachSinhVien, 0, danhSachMoi, 0, soLuongSinhVien - 1);
                    danhSachMoi[soLuongSinhVien - 1] = new SinhVien();
                    System.out.println("Nhập thông tin sinh viên mới:");
                    danhSachMoi[soLuongSinhVien - 1].nhapThongTin();
                    danhSachSinhVien = danhSachMoi;
                    break;
                case 2:
                    System.out.print("Nhập thứ tự sinh viên muốn sửa: ");
                    int chiSoSua = nhap.nextInt() - 1;
                    if (chiSoSua >= 0 && chiSoSua < soLuongSinhVien) {
                        System.out.println("Nhập lại thông tin sinh viên:");
                        danhSachSinhVien[chiSoSua].nhapThongTin();
                    } else {
                        System.out.println("Thứ tự sinh viên không hợp lệ!");
                    }
                    break;
                case 3:
                    for (int i = 0; i < soLuongSinhVien - 1; i++) {
                        for (int j = i + 1; j < soLuongSinhVien; j++) {
                            if (danhSachSinhVien[i].getTuoi() > danhSachSinhVien[j].getTuoi()) {
                                SinhVien temp = danhSachSinhVien[i];
                                danhSachSinhVien[i] = danhSachSinhVien[j];
                                danhSachSinhVien[j] = temp;
                            }
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < soLuongSinhVien - 1; i++) {
                        for (int j = i + 1; j < soLuongSinhVien; j++) {
                            if (danhSachSinhVien[i].getGPA() < danhSachSinhVien[j].getGPA()) {
                                SinhVien temp = danhSachSinhVien[i];
                                danhSachSinhVien[i] = danhSachSinhVien[j];
                                danhSachSinhVien[j] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < soLuongSinhVien - 1; i++) {
                        for (int j = i + 1; j < soLuongSinhVien; j++) {
                            if (danhSachSinhVien[i].getSoBuoiNghi() > danhSachSinhVien[j].getSoBuoiNghi()) {
                                SinhVien temp = danhSachSinhVien[i];
                                danhSachSinhVien[i] = danhSachSinhVien[j];
                                danhSachSinhVien[j] = temp;
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.print("Nhập thứ tự sinh viên muốn xóa: ");
                    int chiSoXoa = nhap.nextInt() - 1;
                    if (chiSoXoa >= 0 && chiSoXoa < soLuongSinhVien) {
                        SinhVien[] danhSachConLai = new SinhVien[soLuongSinhVien - 1];
                        for (int i = 0, k = 0; i < soLuongSinhVien; i++) {
                            if (i == chiSoXoa) {
                                continue;
                            }
                            danhSachConLai[k++] = danhSachSinhVien[i];
                        }
                        danhSachSinhVien = danhSachConLai;
                        soLuongSinhVien--;
                    } else {
                        System.out.println("Thứ tự sinh viên không hợp lệ!");
                    }
                    break;
                case 7:
                    System.out.printf("%-15s%-10s%-20s%-10s%-10s%-12s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số buổi nghỉ");
                    for (SinhVien sinhVien : danhSachSinhVien) {
                        sinhVien.xuatThongTin();
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
}
