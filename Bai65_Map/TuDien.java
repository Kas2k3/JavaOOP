package Bai65_Map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Phuoc
 */
public class TuDien {
    private Map<String, String> duLieu = new TreeMap<String, String>();
    
    public String themTu(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }
    
    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);
    }
    
    public String traTu(String tuKhoa) {
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }
    
    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    
    public int laySoLuong() {
        return this.duLieu.size();
    }
    
    public void xoaTatCa() {
        this.duLieu.clear();
    }
    
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n-------------------");
            System.out.println("MENU");
            System.out.println("Tra tu dien Anh - Viet");
            System.out.println("1. Them tu(Tu khoa, Y nghia).");
            System.out.println("2. Xoa tu.");
            System.out.println("3. Tim y nghia cua tu khoa.");
            System.out.println("4. In ra danh sach tu khoa.");
            System.out.println("5. In ra so luong tu.");
            System.out.println("6. Xoa tat ca cac tu khoa.");
            luaChon = sc.nextInt();
            sc.nextLine();
            
            if(luaChon == 1) {
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhap vao y nghia: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            } else if (luaChon == 2 || luaChon == 3) {
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                if(luaChon == 2) {
                    tuDien.xoaTu(tuKhoa);
                } else {
                    System.out.println("Y nghia la: "+tuDien.traTu(tuKhoa));
                }
            } else if (luaChon == 4) {
                tuDien.inTuKhoa();
            } else if (luaChon == 5) {
                System.out.println("So luong tu khoa la: "+tuDien.laySoLuong());
            } else if (luaChon == 6) {
                tuDien.xoaTatCa();
            }
        } while(luaChon != 0);
    }
}
