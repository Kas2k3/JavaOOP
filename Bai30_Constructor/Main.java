package Bai30_Constructor;

/**
 *
 * @author Phuoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d;
        MyDate md = new MyDate(25, 2, 2029);
        md.printDay();
        md.printMonth();
        md.printYear();
        md.printDate();
    }
    
}
