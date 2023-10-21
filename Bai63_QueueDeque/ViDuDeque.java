package Bai63_QueueDeque;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 *
 * @author Phuoc
 */
public class ViDuDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();
        
        danhSachSV.offer("Kas 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("Kas 2");
        danhSachSV.offerLast("Kas 3");
        danhSachSV.offerFirst("Kas 0");
        
        //Kas 3 > Kas 2 > Nguyen Van B > Nguyen Van A > Kas 1 > Kas 0
        
        while(true) {
            String ten = danhSachSV.poll(); // => Lay ra va xoa
            if (ten == null) {
                break;
            }
            //peek => Lay ra nhung khong xoa
            System.out.println(ten);
        }
    }
}
