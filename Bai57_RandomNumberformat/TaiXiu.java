package Bai57_RandomNumberformat;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * Mot nguoi choi se co tai khoan. Nguoi choi co quyen dat cuoc it hon hoac bang so
 * tien ho dang co. Luat choi nhu sau:
 * Co 3 vien xuc xac. Moi vien xuc xac co 6 mat
 * Moi lan lac se ra mot ket qua. Ket qua = giatri1 + giatri2 + giatri3
 * 1. Neu tong bang 3 hoac 18 (3 so 1, 3 so 6) => Nha cai an het, nguoi choi thua
 * 2. Neu tong = (4->10) <=> Xiu 
 * 3. Neu tong = (11->17) <=> Tai
 */
public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;
        Scanner sc = new Scanner(System.in);
        
        //Locale lc = new Locale("vi", "VN");
        Locale lc = new Locale("en", "US"); //Vi tri
        //NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc); //lay ca don vi tien te   
        
        int luaChon = 1;
        do {
            System.out.println("-----MOI BAN LUA CHON-----");
            System.out.println("Chon (1) de tiep tuc choi.");
            System.out.println("Chon (phim bat ky) de thoat.");
            luaChon = sc.nextInt();
            if(luaChon == 1) {
                double datCuoc = 0;
                System.out.println("*** BAT DAU CHOI: ");
                //Dat cuoc
                System.out.println("****** Tai khoan cua ban: "+numf.format(taiKhoanNguoiChoi)+"  , ban muon cuoc bao nhieu?");
                do {
                    System.out.println("****** Dat cuoc (0 < so tien cuoc <= "+numf.format(taiKhoanNguoiChoi)+")");
                    datCuoc = sc.nextDouble();
                } while(datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
                
                //Chon tai xiu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("****** Chon: 1 <-> Tai hoac 2 <-> Xiu");
                    luaChonTaiXiu = sc.nextInt();
                } while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                
                //Tung xuc xac
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();
                
                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;
                
                //Tinh toan ket qua:
                System.out.println("****** Ket qua: "+giaTri1+" - "+giaTri2+" - "+giaTri3);
                if (tong == 3 || tong == 18) {
                    System.out.println("****** Tong la: "+tong+ " => Nha cai an het, ban da thua!");
                    System.out.println("****** Tai khoan cu ban la: "+numf.format(taiKhoanNguoiChoi));
                }   
                else if (tong >= 4 && tong <= 10) {
                    System.out.println("****** Tong la: "+tong+" => Xiu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("****** Ban da thang cuoc");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tai khoan cu ban la: "+numf.format(taiKhoanNguoiChoi));
                    } 
                    else {
                        System.out.println("****** Ban da thua cuoc");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tai khoan cu ban la: "+numf.format(taiKhoanNguoiChoi));
                    }    
                        
                } else {
                    System.out.println("****** Tong la: "+tong+" => Tai");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("****** Ban da thang cuoc");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tai khoan cu ban la: "+numf.format(taiKhoanNguoiChoi));
                    } 
                    else {
                        System.out.println("****** Ban da thua cuoc");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tai khoan cu ban la: "+numf.format(taiKhoanNguoiChoi));
                    } 
                }
            }
        } while(luaChon == 1);
    }
}
