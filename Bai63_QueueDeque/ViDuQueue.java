package Bai63_QueueDeque;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Phuoc
 */
public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        
        danhSachSV.offer("Kas 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("Kas 2");
        
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
