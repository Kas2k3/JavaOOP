package Bai42_Overriding;

/**
 *
 * @author Phuoc
 */
public class Cat extends Animal{
    
    public Cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public void eat() {
        System.out.println("Toi an ca");
    }
    
    
}
