package Bai34_equals_hascode;

import Bai33_toString.*;

/**
 *
 * @author Phuoc
 */
public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        if (day >= 1 && day <= 31){
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 1;
        }   
    }
        public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    
    public void setDay(int d) {
        if (d >= 1 && d <= 31)
            this.day = d;
    }
    public void setMonth(int m) {
        if (m >= 1 && m <= 12)
            this.month = m;
    }
    public void setYear(int y) {
        if (y >= 1)
            this.year = y;
    }
    
    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    @Override
    public boolean equals(Object obj) { //Lop Object dai dien cho tat ca doi tuong
        if (this == obj) { //this la lop dang dung 
            return true;
        }
        if (obj == null) { //Doi tuong truyen vao la null
            return false;
        }
        if (this.getClass() != obj.getClass()) { //Doi tuong this tao ra tu class nao, so sanh voi lop obj
            return false;
        }
        //So sanh tung du lieu ben trong
        final MyDate other = (MyDate) obj;//Ep kieu du lieu
        if (this.day != other.day) { //other la bien duoc truyen vao
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year)
            return false;
        return true;
    }

    @Override
    public int hashCode() { //Phat sinh ngau nhien hash
        int hash = 7; 
        hash = 59 * hash + this.day;
        hash = 59 * hash + this.month;
        hash = 59 * hash + this.year;
        return hash;
    }
    
    
}
