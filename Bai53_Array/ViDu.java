package Bai53_Array;

import java.util.Arrays;

/**
 *
 * @author Phuoc
 */
public class ViDu {
    public static void main(String[] args) {
        //Kieu nguyen thuy
        int[] mang1 = {1, 2, 3};
        
        //Copy mang cach 1, lam anh huong mang ban dau
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        
        System.out.println("Mang 1: "+Arrays.toString(mang1));
        System.out.println("Mang1_a: "+Arrays.toString(mang1_a));
        
        //Copy mang cach 2 - dung ham clone, khong lam anh huong mang ban dau
        int[] mang1_b = mang1.clone();
        mang1_a[0] = 50;
        System.out.println("Mang1_b: "+Arrays.toString(mang1_a));
        
        //Copy mang cach 3 - dung ham System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c ,0 , mang1.length);
        mang1_c[0] = 90;
        System.out.println("Mang1_c: "+Arrays.toString(mang1_c));
        
        //Kieu nguyen thuy
        String[] mang_doi_tuong = {"Kas", ".vn"};
        //Tuong tu ben tren
    }
}
