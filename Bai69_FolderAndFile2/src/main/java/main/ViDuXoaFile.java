package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Phuoc
 */
public class ViDuXoaFile {
    
    public static void xoaFile(File fx) {
        if(fx.isFile()) {
            //Xoa neu la tap tin
            System.out.println("Da xoa: "+fx.getAbsolutePath());
            fx.delete();
        } else if (fx.isDirectory()) {
            //Lay cac file con
            File[] mangCon = fx.listFiles();
            for(File f: mangCon) {
                //Xoa cac file con
                xoaFile(f);
            }
            //Xoa ban than thu muc sau khi xoa cac file con
            System.out.println("Da xoa: "+fx.getAbsolutePath());
            fx.delete();
        }
    }
    
    public static void xoaFile2(File fx) {
        //Su dung Files, delete...
    }
    
    public static void main(String[] args) {
        //Su dung class File xoa tap tin hoac thu muc
        File f0 = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Bai69_FolderAndFile2\\F0");
        File f0_1 = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Bai69_FolderAndFile2\\F0_1");
        File f_vidu = new File("D:\\OneDrive - Hanoi University of Science and Technology\\Documents\\NetBeansProjects\\Bai69_FolderAndFile2\\ViDu.txt");
        
        /*
        //f0.deleteOnExit(); => Khong xoa duoc vi co chua thu muc va tap tin
        f0_1.deleteOnExit(); //=> Xoa duoc vi la thu muc rong
        f_vidu.deleteOnExit(); //=> Xoa duoc vi la tap tin
        System.out.println(f0_1.delete()); //Xoa khong thanh cong vi tap tin khong ton tai
        
        ViDuXoaFile.xoaFile(f0); */
        
        //Su dung class Files xoa tap tin va thu muc
        Path p0 = f0.toPath();
        Path p0_1 = f0_1.toPath();
        Path p_vidu = f_vidu.toPath();
       
        try {
            //Files.deleteIfExists(p0); => Khong xoa duoc
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_vidu);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
