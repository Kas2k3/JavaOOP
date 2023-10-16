package code;

/**
 *
 * @author Phuoc
 */
public class Infor {
    private int a; //Chi co the truy cap trong cung 1 class
    int b; //Truy cap trong cung class, package
    protected int c; //Truy cap trong cung class, package, subclass
    public int d; //Truy cap tat ca
    
    public void method() {
        this.a = 1;
        this.b = 2;
        this.c = 3;
        this.d = 4;
    }
}
