package Bai63_QueueDeque;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Phuoc
 */
public class ViDuPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new PriorityQueue<String>();
        
        danhSachSV.offer("Kas 1");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("Nguyen Van A");
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
