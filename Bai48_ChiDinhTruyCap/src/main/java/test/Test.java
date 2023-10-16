package test;

import code.Infor;

/**
 *
 * @author Phuoc
 */
public class Test {
    private Infor infor;
    
    public void method() {
        //this.infor.a; => Khong truy cap duoc 
        //this.infor.b; => Khong truy cap duoc 
        //this.infor.c; => Khong truy cap duoc 
        this.infor.d = 4; //Truy cap duoc 
        
    }
}
