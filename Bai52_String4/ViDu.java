package Bai52_String4;

/**
 *
 * @author Phuoc
 */
public class ViDu {
    public static void main(String[] args) {
        String s1 = "kas";
        String s2 = ".vn";
        
        String s3 = s1 + s2;
        //Ham concat => Noi chuoi
        String s4 = s1.concat(s2);
        System.out.println("s3 = "+s3);
        System.out.println("s4 = "+s4);
        
        //Ham replace => Thay the
        String s5 = "Phuoc.vn";
        String s6 = s5.replaceAll("Phuoc","Kas");
        System.out.println("s6 = "+s6);
        
        //Ham toLowerCase => Chuyen ve viet thuong
        //Ham toUpperCase => Chuyen ve viet hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7 = "+s7);
        System.out.println("s8 = "+s8);
        
        //trim() => Xoa khoang trang du thua o dau chuoi
        String s9  = " Xin chao cac ban, minh la Kas.vn   ";
        System.out.println(s9.trim());
        
        //substring => Cat chuoi con
        String s10 = "Xin chao cac ban, minh la Kas";
        String s11 = s10.substring(10);
        String s12 = s10.substring(10, 15); //neu beginIndex la so am => tro thanh 0
        System.out.println("s11 = "+s11);
        System.out.println("s12 = "+s12);
    }
}
