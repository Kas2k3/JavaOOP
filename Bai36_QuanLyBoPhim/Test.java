package Bai36_QuanLyBoPhim;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15, 05, 2022);
        Ngay ngay2 = new Ngay(31, 01, 2025);
        Ngay ngay3 = new Ngay(16, 02, 2030);
        
        HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A", "Viet Nam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B", "My");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C", "Ba Lan");
        
        BoPhim boPhim1 = new BoPhim("Bo Gia", 2020, hangSanXuat1, 65000, ngay1);
        BoPhim boPhim2 = new BoPhim("Running Man", 2021, hangSanXuat2, 100000, ngay2);
        BoPhim boPhim3 = new BoPhim("Kham pha Ba Lan", 2025, hangSanXuat3, 115000, ngay3);
    
        System.out.println("So sanh gia 1 re hon 2: "+boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println("So sanh gia 3 re hon 2: "+boPhim3.kiemTraGiaVeReHon(boPhim2));
        
        System.out.println("Ten hang san xuat bo phim 3: "+boPhim3.layTenHangSanXuat());
        
        System.out.println("Bo phim 1 giam 10% thi con: "+boPhim1.giaSauKhuyenMai(10));
        System.out.println("Bo phim 2 giam 20% thi con: "+boPhim2.giaSauKhuyenMai(20));
        System.out.println("Bo phim 3 giam 50% thi con: "+boPhim3.giaSauKhuyenMai(50));
    
    }
    
}
