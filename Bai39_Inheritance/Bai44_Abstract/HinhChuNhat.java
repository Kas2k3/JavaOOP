package Bai44_Abstract;

/**
 *
 * @author Phuoc
 */
public class HinhChuNhat extends Hinh {
    private double chieuRong, chieuCao;

    public HinhChuNhat(double chieuRong, double chieuCao, ToaDo toaDo) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuCao*this.chieuRong;
    }
    
    
}
