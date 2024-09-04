import java.util.Arrays;
class quicksort{
    public static void qsort(int[] arr,int a,int b){
        int low=a;
        int high=b;
        if(low>=high){
            return;
        }
        int start=a;
        int end=b;
        int pivot=(low+high)/2;
while(start<=end){
        while(arr[start]<arr[pivot]){
            start++;
        }
        while(arr[end]>arr[pivot]){
            end--;
        }
        if(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }


    }
    qsort(arr, low,end);
    qsort(arr,start,high);
}
}
public class Quick_Sort {
    public static void main(String []args){
        int arr[]={2,1,4,5,3,2,5,8,1};
        quicksort.qsort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
