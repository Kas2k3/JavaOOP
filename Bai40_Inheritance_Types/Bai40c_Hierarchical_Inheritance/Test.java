package Bai40c_Hierarchical_Inheritance;

/**
 *
 * @author Phuoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        
        Cat c = new Cat();
        c.eat();
        c.meow();
        
        Bird b = new Bird();
        b.eat();
        b.fly();
    }
    
}
