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
        int pval=arr[pivot];
while(start<=end){
        while(arr[start]<pval){
            start++;
        }
        while(arr[end]>pval){
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
       // int arr[]={5, 4, 1, 3, 6, 2, 1};
       int arr[] = {2,2,2,2,2}; 
       int arr1[]={-5,-3,0,34,4,0,-5};


        quicksort.qsort(arr, 0, arr.length-1);
        quicksort.qsort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    
}
