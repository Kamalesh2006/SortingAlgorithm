import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] arr){

        for(int i =0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = true;
                    arr[j+1]=arr[j]+arr[j+1]-(arr[j]=arr[j+1]);
                }
            }
            if(!flag)
                break;
        }
    }
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] arr ={6,2,3,4,1,5};
        b.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
