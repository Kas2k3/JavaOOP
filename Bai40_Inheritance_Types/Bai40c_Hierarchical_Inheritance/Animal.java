package Bai40c_Hierarchical_Inheritance;

import Bai40b_Multilevel_Inheritance.*;
import Bai40a_Single_Inheritance.*;

/**
 *
 * @author Phuoc
 */
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println("I'm eating");
    }
}
