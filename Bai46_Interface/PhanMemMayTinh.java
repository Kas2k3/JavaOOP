package Bai46_Interface;

/**
 *
 * @author Phuoc
 */

//Trong cung 1 subclass co the implement nhieu interface cung luc
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{

    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b; //Nen dung try catch de bat loi phep chia 0
    }
        
    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, j;
        double key;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i -1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        int i, j;
        double key;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i -1;
            
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
