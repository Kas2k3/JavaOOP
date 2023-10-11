package Bai37_QuanLySinhVien;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(19, 7, 2003);
        Ngay ngay2 = new Ngay(17, 2, 2002);
        Ngay ngay3 = new Ngay(19, 7, 2003);
        
        Lop lop1 = new Lop("DH01", "Khoa CNTT");
        Lop lop2 = new Lop("DH02", "Khoa KHMT");
        Lop lop3 = new Lop("DH03", "Khoa KTMT");
    
        SinhVien sv1 = new SinhVien("0001", "A", ngay1, 9.0, lop1);
        SinhVien sv2 = new SinhVien("0002", "B", ngay2, 3.0, lop2);
        SinhVien sv3 = new SinhVien("0003", "C", ngay3, 6.0, lop3);
        
        System.out.println("Ten khoa: ");
        System.out.println("Sinh vien 1: "+sv1.layTenKhoa());
        System.out.println("Sinh vien 2: "+sv2.layTenKhoa());
        System.out.println("Sinh vien 3: "+sv3.layTenKhoa());
        
        System.out.println("Kiem tra thi dat: ");
        System.out.println("Sinh vien 1: "+sv1.kiemTraThiDat());
        System.out.println("Sinh vien 2: "+sv2.kiemTraThiDat());
        System.out.println("Sinh vien 3: "+sv3.kiemTraThiDat());
        
        System.out.println("Kiem tra cung ngay sinh: ");
        System.out.println("SV1 va SV3: "+sv1.kiemTraCungNgaySinh(sv3));
        System.out.println("SV2 va SV3: "+sv2.kiemTraCungNgaySinh(sv3));
        
    }   
}
