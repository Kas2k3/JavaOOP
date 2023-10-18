package Bai50_String2;

/**
 *
 * @author Phuoc
 */
public class ViDu {
    public static void main(String[] args) {
        String s1 = "kas.vn";
        String s2 = "KAS.vn";
        String s3 = "kas.vn";
        
        //Ham equals => ss 2 chuoi giong nhau, co phan biet chu hoa, thuong
        System.out.println("s1 equals: "+s1.equals(s2));
        System.out.println("s1 equals: "+s1.equals(s3));
        
        //Ham equalsIgnoreCase => ss 2 chuoi giong nhau khong phan biet chu hoa, thuong
        System.out.println("s1 equalsIgnoreCase: "+s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase: "+s1.equalsIgnoreCase(s3));
        
        //Ham compareTo => so sanh > < = tra ve gia tri am, duong, bang 0
        //Ham compareToIgnoreCase => Khong phan biet chu hoa, thuong
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van A";
        System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
        
        //Ham regionMatches => so sanh mot doan
        //Neu them true, false truoc toffset thi lien quan den chu hoa, thuong
        String r1 = "KAS.vn";
        String r2 = "S.v";
        boolean check = r1.regionMatches(2, r2, 0, 3);
        System.out.println(check);
        
        //Ham startWith => Ham kiem tra chuoi bat dau bang ...
        String sdt = "037456789";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("034"));
        
        //Ham kiem tra chuoi ket thuc bang ...
        String tenFile = "I love you.JPG";
        String tenFile2 = "Hoc Java.PDF";
        
        if (tenFile.endsWith(".JPG")) {
            System.out.println("File 1 la hinh anh!");
        }
        else if (tenFile.endsWith(".PDF")) {
            System.out.println("File 1 la file PDF!");
        }
        if (tenFile2.endsWith(".JPG")) {
            System.out.println("File 2 la hinh anh!");
        }
        else if (tenFile2.endsWith(".PDF")) {
            System.out.println("File 2 la file PDF!");
        }
    }
}
