package Bai46_Interface;

/**
 *
 * @author Phuoc
 */
public class SapXepChon implements SapXepInterface{

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, j , min_idx;
        //Di chuyen ranh gioi cua mang da sap xep va chua sap xep
        for (i = 0; i < n-1; i++) {
            //Tim phan tu nho nhat trong mang chua sap xep
            min_idx = i;
            for (j = i+1; j < n; j++)
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            
            //Doi cho phan tu nho nhat voi phan tu dau tien
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        int i, j , min_idx;
        for (i = 0; i < n-1; i++) {
            min_idx = i;
            for (j = i+1; j < n; j++)
                if(arr[j] > arr[min_idx])
                    min_idx = j;
            
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
        }
    }
    
}
