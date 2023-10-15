package Bai44_Abstract;

/**
 *
 * @author Phuoc
 */
public class Diem extends Hinh{
    
    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    @Override
    public double tinhDienTich() {
        return 1;
    }    
    
}
