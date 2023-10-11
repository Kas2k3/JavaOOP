package Bai32_Get_Set;

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
    
}
