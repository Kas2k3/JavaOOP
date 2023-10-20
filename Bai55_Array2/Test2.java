package Bai55_Array2;

import java.util.Arrays;

/**
 *
 * @author Phuoc
 */
public class Test2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(150, "Tran Van Thanh", "Lop 1", 9);
        SinhVien sv2 = new SinhVien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
        SinhVien sv3 = new SinhVien(199, "Nguyen Van A", "Lop 2", 8);
        SinhVien sv4 = new SinhVien(199, "Nguyen Van Binh       ", "Lop 2", 8);
    
        SinhVien[] a_sv = new SinhVien[]{sv1, sv2, sv3};
        
        System.out.println("Ban dau: "+Arrays.toString(a_sv));
        //Ham sap xep
        Arrays.sort(a_sv);
        System.out.println("Sau khi sap xep: "+Arrays.toString(a_sv));
        
        //Tim kiem
        System.out.println("Tim kiem An: "+Arrays.binarySearch(a_sv, sv3));
        System.out.println("Tim kiem Binh: "+Arrays.binarySearch(a_sv, sv4));
    }
}
