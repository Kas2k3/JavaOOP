package Bai40a_Single_Inheritance;

/**
 *
 * @author Phuoc
 */
public class Dog extends Animal {
    public Dog() {
        super("Dog"); //Truyen tu khoa Dog qua ham constructor cua lop Animal
    }
    
    public void bark() {
        System.out.println("Gau gau");
    }
}
