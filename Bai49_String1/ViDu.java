package Bai49_String1;

import java.util.Scanner;

/**
 *
 * @author Phuoc
 */
public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao chuoi: ");
        s = sc.nextLine();//Nhap duoc 1 chuoi tu cua so console
        System.out.println("-----");
        
        //Ham length() => Lay do dai chuoi 
        System.out.println(s.length());
        int doDai = s.length();
        
        //Ham charAt(vi tri) => Lay ra mot ky tu tai vi tri bat ky trong chuoi
        for(int i = 0; i < doDai; i++) {
            System.out.println("Vi tri "+i+" la: "+s.charAt(i));
        }
        
        //Ham getChars(vi tri bat dau, vi tri ket thuc, mang du lieu, vi tri bat dau luu cua mang)
        char[] arrayChar = new char[100];
        s.getChars(2, 5, arrayChar, 0);
        for(int i = 0; i < arrayChar.length; i++) {
            System.out.println("Gia tri cua mang tai "+i+" la: "+arrayChar[i]);
        }
        
        //Ham getBytes() => Co 3 cach, lay ra gia tri cua cac ky tu thanh mot mang
        byte[] arrayBytes = s.getBytes();
        for (byte b : arrayBytes) {
            System.out.println(b);
        }
    }   
}
