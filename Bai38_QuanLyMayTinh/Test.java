package Bai38_QuanLyMayTinh;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 8, 2025);
        Ngay ngay2 = new Ngay(1, 3, 2025);
        Ngay ngay3 = new Ngay(6, 9, 2025);
        
        QuocGia quocGia1 = new QuocGia("VN", "Viet Nam");
        QuocGia quocGia2 = new QuocGia("USA", "Hoa Ky");
        QuocGia quocGia3 = new QuocGia("PL", "Ba Lan");
        
        HangSanXuat hangSanXuat1 = new HangSanXuat("VNLaptop", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Macbook", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("Asus", quocGia3);
        
        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 1500, 12);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 2000, 24);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 1000, 12);
    
        System.out.println("So sanh gia thap hon: ");
        System.out.println("M1 < M2: "+mayTinh1.kiemTraGiaThapHon(mayTinh2));
        System.out.println("M1 < M3: "+mayTinh1.kiemTraGiaThapHon(mayTinh3));
        
        System.out.println("Ten quoc gia: ");
        System.out.println("M1: "+mayTinh1.layTenQuocGia());
        System.out.println("M2: "+mayTinh2.layTenQuocGia());
        System.out.println("M3: "+mayTinh3.layTenQuocGia());
    }
    
}
