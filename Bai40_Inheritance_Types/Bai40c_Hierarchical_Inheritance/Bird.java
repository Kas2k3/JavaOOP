package Bai40c_Hierarchical_Inheritance;

/**
 *
 * @author Phuoc
 */
public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }
    
    public void fly() {
        System.out.println("I'm flying");
    }
}
