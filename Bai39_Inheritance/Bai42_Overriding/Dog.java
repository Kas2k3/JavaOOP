package Bai42_Overriding;

/**
 *
 * @author Phuoc
 */
public class Dog extends Animal{
    
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("gau gau");
    }

    @Override
    public void eat() {
        System.out.println("Toi an xuong");
    }
       
    
}
