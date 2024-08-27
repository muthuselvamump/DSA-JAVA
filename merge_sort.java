import java.util.Arrays;

class sorting{
    public static int[] merge(int []arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr,0, mid));
        int[] right=merge(Arrays.copyOfRange(arr, mid, arr.length));
        return mergesort(left,right);
    }
    public static int[] mergesort(int left[],int right[]){

    }
}
public class merge_sort {
    public static void main(String []args){

    }
    
}
