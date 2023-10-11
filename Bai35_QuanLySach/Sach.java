package Bai35_QuanLySach;

/**
 *
 * @author Phuoc
 */
public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacgia;

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacgia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacgia = tacgia;
    }
    
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacgia() {
        return tacgia;
    }

    public void setTacgia(TacGia tacgia) {
        this.tacgia = tacgia;
    }
    
    public void inTenSach() {
        System.out.println(this.tenSach);
    }
    
    public boolean kiemTraCungNamXuatBan(Sach sachKhac) {
        return this.namXuatBan == sachKhac.namXuatBan;
    }
    
    public double giaSauKhiGiam(double x) {
        return this.giaBan*(1-x/100);
    }
}
