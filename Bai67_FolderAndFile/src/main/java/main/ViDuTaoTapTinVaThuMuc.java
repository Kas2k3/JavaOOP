package main;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Phuoc
 */
public class ViDuTaoTapTinVaThuMuc {
    public static void main(String[] args) throws IOException {
        //Luu y:
        //MS Windows; \ => \\ VD: "C:\\Thu muc 1\\Thu muc\\Ten tap tin.xxx"
        //Linux, MacOS: / | VD: Thu muc 1/Thu muc 2/Ten tap tin.xxx
        
        //Kiem tra thu muc hoac tap tin co ton tai hay khong?
        File folder1 = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Java_67");
        File folder2 = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Java_68");
        
        System.out.println("Kiem tra folder1 co ton tai hay khong: "+folder1.exists());
        System.out.println("Kiem tra folder2 co ton tai hay khong: "+folder2.exists());
        
        //Tao thu muc
        //Phuong thuc mkdir() => Tao 1 thu muc
        File d1 = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Java_68\\Directory_1");
        d1.mkdir();
        
        //Phuong thuc mkdirs() => Tao nhieu thu muc cung luc
        File d2 = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Java_68\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
        d2.mkdirs();
        
        //Tao tap tin (co phan mo rong: .exe, .txt, .doc, .xls ....)
        File file1 = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Java_67\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            //Khong co quyen tao tap tin
            //O cung bi day
            //Duong dan bi sai
            e.printStackTrace();
        }
    }
}
