package Bai45_BT_KeThua_TruuTuong;

/**
 *
 * @author Phuoc
 */
public class XeDap extends PhuongTienDiChuyen{
    
    public XeDap(HangSanXuat hangSanXuat) {
        super("XeDap", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
    
}
