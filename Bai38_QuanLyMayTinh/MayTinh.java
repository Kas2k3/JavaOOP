package Bai38_QuanLyMayTinh;

/**
 *
 * @author Phuoc
 */
public class MayTinh {
    private HangSanXuat hangSanXuat;
    private Ngay ngaySanXuat;
    private double giaBan, thoiGianBanBanh;

    public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, double giaBan, double thoiGianBanBanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBanBanh = thoiGianBanBanh;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThoiGianBanBanh() {
        return thoiGianBanBanh;
    }

    public void setThoiGianBanBanh(double thoiGianBanBanh) {
        this.thoiGianBanBanh = thoiGianBanBanh;
    }

    public boolean kiemTraGiaThapHon(MayTinh mtKhac) {
        return this.giaBan < mtKhac.giaBan;
    }
    
    public String layTenQuocGia() {
        return this.hangSanXuat.layTenQuocGia();
    }
}
