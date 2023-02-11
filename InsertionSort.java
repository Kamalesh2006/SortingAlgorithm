import java.util.Scanner;
import java.util.Arrays;

class InsertionSort{
    public static void insertSort(int[] arr){

        for(int i =1;i<arr.length;i++){
            for(int j =i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j-1]+arr[j]-(arr[j-1]=arr[j]); //b=a+b-(a=b);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int size = sh.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sh.nextInt();
        }
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        sh.close();
    }
}