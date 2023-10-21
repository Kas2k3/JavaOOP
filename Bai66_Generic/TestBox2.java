package Bai66_Generic;

/**
 *
 * @author Phuoc
 */
public class TestBox2 {
    public static void main(String[] args) {
        Box2 b1 = new Box2<Integer>(15);
        System.out.println("Gia tri: "+b1.getValue());
        
        Box2 b2 = new Box2<String>("Hello Kas!!");
        System.out.println("Gia tri: "+b2.getValue());
        
        Box2 b3 = new Box2<Integer>(15.5);
        System.out.println("Gia tri: "+b3.getValue());
    }
}
