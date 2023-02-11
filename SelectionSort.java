import java.util.Arrays;

public class SelectionSort {

    public void bubbleSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            int index =i;
            for(int j =i;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index =j;
                }
            }
            arr[i]=arr[index]+arr[i]-(arr[index]=arr[i]);
            
        }
    }
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] arr = new int[]{5,4,3,2,1};
        s.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
