package Bai44_Abstract;

/**
 *
 * @author Phuoc
 */
public class HinhTron extends Hinh {
    private double r;

    public HinhTron(double r, ToaDo toaDo) {
        super(toaDo);
        this.r = r;
    }
    

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*this.r*this.r;
    }
    
    
}
