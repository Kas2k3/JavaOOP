package Bai45_BT_KeThua_TruuTuong;

/**
 *
 * @author Phuoc
 */
public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienlieu;

    public XeOto(HangSanXuat hangSanXuat, String loaiNhienlieu) {
        super("XeOto", hangSanXuat);
        this.loaiNhienlieu = loaiNhienlieu;
    }

    public String getLoaiNhienlieu() {
        return loaiNhienlieu;
    }

    public void setLoaiNhienlieu(String loaiNhienlieu) {
        this.loaiNhienlieu = loaiNhienlieu;
    }

    @Override
    public double layVanToc() {
        return 150;
    } 
}
