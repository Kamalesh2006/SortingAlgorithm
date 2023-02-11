import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public void merge(int[] arr, int lb, int mid, int ub){
        int[] tempArr = new int[ub-lb+1];
        int k =0;
        int left= lb;
        int right = mid+1;
        while(left<=mid && right<=ub){
            if(arr[left]<arr[right]){
                tempArr[k]=arr[left];
                left++;
            }
            else{
                tempArr[k]=arr[right];
                right++;
            }
            k++;
        }
        if(left>mid){
            while(right<=ub){
                tempArr[k++]=arr[right++];
            }
        }
        else{
            while(left<=mid){
                tempArr[k++]=arr[left++];
            }
        }
        k=0;
        for(int i =lb;i<=ub;i++){
            arr[i]=tempArr[k++];
        }
    }
    public void mergeSort(int[] arr, int lb, int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr, lb, mid, ub);
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
        MergeSort m = new MergeSort();
        m.mergeSort(arr, 0, size-1);
        System.out.println(Arrays.toString(arr));
        sh.close();
        
    }
}
