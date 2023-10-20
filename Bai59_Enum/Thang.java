package Bai59_Enum;

/**
 *
 * @author Phuoc
 */
public enum Thang {
    Thang_mot(31),
    Thang_hai(29),
    Thang_ba(31),
    Thang_tu(30),
    Thang_nam(31),
    Thang_sau(30),
    Thang_bay(31),
    Thang_tam(31),
    Thang_chin(30),
    Thang_muoi(31),
    Thang_muoi_mot(30),
    Thang_muoi_hai(31);
    
    private final int soNgay;
    Thang(int soNgay) {
    this.soNgay = soNgay;
    }
    public int soNgay() {
        return soNgay;
    }
}
