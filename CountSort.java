import java.util.Arrays;

public class CountSort {
    public void countSort(int[] arr){
        int findMax=arr[0];
        for(int i =0;i<arr.length;i++){
            if(findMax<arr[i]){
                findMax = arr[i];
            }
        }

        int[] countArr = new int[findMax+1];

        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;
        }
        for(int i =1;i<countArr.length;i++){
            countArr[i] += countArr[i-1];
        }

        int[] result = new int[arr.length];

        for(int i =arr.length-1;i>=0;i--){
            int index = --countArr[arr[i]];
            result[index]= arr[i];
        }

        for(int i =0;i<arr.length;i++){
            arr[i]=result[i];
        }
    }
    public static void main(String[] args) {
        CountSort cs = new CountSort();
        int[] arr = {0,3,0,1,2,0,3,5,6,7,5,6,4,3,2,1};
        cs.countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
