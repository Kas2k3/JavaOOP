package Bai59_Enum;

/**
 *
 * @author Phuoc
 */
public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Toan, Ly, Hoa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Monday, "Van, Su, Dia");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Monday, "Ly, Hoa, Sinh");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Monday, "Tin, GDCD, The Duc");
        System.out.println(tkb_t5);
        
        int x = Thang.Thang_mot.soNgay();
        System.out.println(x);
        
    
    }    
}
