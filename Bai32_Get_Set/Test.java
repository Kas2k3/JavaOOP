package Bai32_Get_Set;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDate md = new MyDate(31, 1, 2021);
        System.out.println("Day = "+md.getDay());
        md.setDay(35);
        System.out.println("Day = "+md.getDay());
        md.setDay(30);
        System.out.println("Day = "+md.getDay());
        
        System.out.println("Day = "+md.getMonth());
        md.setMonth(13);
        System.out.println("Day = "+md.getMonth());
        md.setMonth(5);
        System.out.println("Day = "+md.getMonth());
    }
    
}
