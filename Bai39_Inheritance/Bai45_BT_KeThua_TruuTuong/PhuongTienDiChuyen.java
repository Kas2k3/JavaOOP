package Bai45_BT_KeThua_TruuTuong;

/**
 *
 * @author Phuoc
 */
public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

   

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }
    
    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }
    
    public void batDau() {
        System.out.println("Start...");
    }
    
    public void tangToc() {
        System.out.println("Run...");
    }
    
    public void dungLai() {
        System.out.println("Stop...");
    }
    
    public abstract double layVanToc();
}
