import java.util.Arrays;

public class RadixSort {
    public void radixSort(int[] arr){
        int maxElement = arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxElement<arr[i])
                maxElement = arr[i];
        }
        

        for(int pos =1;maxElement/pos>0;pos=pos*10){

            int[] countArr = new int[10];
            for(int i =0;i<arr.length;i++){
                int index = (arr[i]/pos)%10;
                countArr[index]++;
            }

            for(int i =1;i<10;i++){
                countArr[i] += countArr[i-1];
            }

            int b[] = new int[arr.length];

            for(int i =arr.length-1;i>=0;i--){
                int index = --countArr[(arr[i]/pos)%10];
                b[index]=arr[i];
            }

            //copying into arr
            for(int i =0;i<arr.length;i++){
                arr[i]=b[i];
            }

        }
    }
    public static void main(String[] args) {
        RadixSort rs = new RadixSort();
        int[] arr = {666,124,8,125,65};
        rs.radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
