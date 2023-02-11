import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public int partition (int[] arr, int lb, int ub){
        int start = lb;
        int end = ub;
        int pivot = arr[lb];
        while(start<end){
            while(start< ub && arr[start]<=pivot){
                start++;
            }
            while(lb < end && arr[end]>pivot){
                end--;
            }
            if(start<end)
                arr[start]=arr[end]+arr[start]-(arr[end]=arr[start]);
        }
        arr[lb]=arr[end]+arr[lb]-(arr[end]=arr[lb]);
        return end;
    }
    public void quickSort(int[] arr, int lb, int ub){
        if(lb<ub){
            int val = partition(arr, lb, ub);
            quickSort(arr, lb, val-1);
            quickSort(arr, val+1, ub);
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sh.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sh.nextInt();
        }
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, size-1);
        System.out.println(Arrays.toString(arr));
        sh.close();
    }
}
