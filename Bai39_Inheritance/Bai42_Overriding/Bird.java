package Bai42_Overriding;

/**
 *
 * @author Phuoc
 */
public class Bird extends Animal {
    
    public Bird() {
        super("Bird");
    }

    @Override
    public void makeSound() {
        System.out.println("Liu lo");
    }

    @Override
    public void eat() {
        System.out.println("Toi an sau");
    }
    
    
}
