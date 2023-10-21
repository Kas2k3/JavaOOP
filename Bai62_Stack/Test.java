package Bai62_Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Phuoc
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<String> stackChuoi = new Stack<String>();
        
        //stackChuoi.push("giatri") => Dua gia tri vao stack
        //stackChuoi.pop() => Lay gia tri ra
        //stackChuoi.peek() => Lay gia tri ra, nhung khong xoa khoi stack
        //stackChuoi.clear() => Xoa tat ca cac phan tu trong stack
        //stackChuoi.contains("giatri") => Xac dinh gia tri co ton tai trong stack hay khong
        //stackChuoi.size() => Lay ra do lon cua stack
        
        
        //Vi du dao nguoc chuoi
        System.out.println("Nhap vao chuoi: ");
        String s = sc.nextLine();
        //KAS
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("Chuoi dao nguoc: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println();
        
        //Chuyen tu he thap phan sang he nhi phan
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("Nhap 1 so nguyen duong tu ban phim: ");
        int x = sc.nextInt();
        while(x > 0) {
            int soDu = x % 2;
            stackSoDu.push(soDu + "");
            x = x / 2;
        }
        System.out.println("So nhi phan la: ");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
