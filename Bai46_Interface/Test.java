package Bai46_Interface;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test yeu cau thu nhat: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
        
        System.out.println("5 + 3 = "+mfx500.cong(5, 3));
        System.out.println("4 * 5 = "+mvn500.nhan(4, 5));
        System.out.println("4 / 0 = "+mvn500.chia(4, 0));
        
        System.out.println("Test yeu cau thu hai: ");
        double[] arr = new double[] {5, 1, 3, 4, 5, 8, 0};
        double[] arr2 = new double[] {6, 2, 7, 9, 2, 4, 5};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();
        
        sxchen.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        sxchen.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        
        System.out.println("Test yeu cau thu ba: ");
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("3 + 5 = "+pmmt.cong(3, 5));
        double[] arr3 = new double[] {6, 2, 7, 9, 2, 4, 5};
        pmmt.sapXepTang(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
    
}
