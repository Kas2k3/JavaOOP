package Bai39_Inheritance;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kiem tra con nguoi: ");
        ConNguoi cn = new ConNguoi("Kas", 2003);
        cn.an();
        cn.uong();
        cn.ngu();  
        
        System.out.println("Kiem tra hoc sinh: ");
        HocSinh hs = new HocSinh("Lớp A", "Trường B", "Kas", 2003);
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lamBaiTap();
    }
    
}
