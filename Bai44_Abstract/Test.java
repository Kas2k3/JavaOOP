package Bai44_Abstract;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5, 5);
        ToaDo td2 = new ToaDo(7, 9);
        ToaDo td3 = new ToaDo(12, 1);
        
        //Hinh h = new Hinh(td1); =>Loi dien dich do class abstract
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(10, td2);
        Hinh h3 = new HinhChuNhat(5, 10, td3);
        
        System.out.println("DT1: "+h1.tinhDienTich());
        System.out.println("DT2: "+h2.tinhDienTich());
        System.out.println("DT3: "+h3.tinhDienTich());
        
    }
    
}
