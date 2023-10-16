package code;

/**
 *
 * @author Phuoc
 */
public class Sub_Infor extends Infor {
    public void method() {
        //super.a; => Khong truy cap duoc
        //super.b; //Truy cap duoc, vi chung 1 goi
        super.c = 3; //Truy cap duoc
        super.d = 4; //Truy cap duoc
    }
}
