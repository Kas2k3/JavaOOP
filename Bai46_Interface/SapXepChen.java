package Bai46_Interface;

/**
 *
 * @author Phuoc
 */
public class SapXepChen implements SapXepInterface{

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, j;
        double key;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i -1;
            /* Di chuyen cac phan tu co gia tri lon hon ve sau 
            mot vi tri so voi vi tri ban dau cua no */
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
