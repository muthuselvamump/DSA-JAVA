import java.util.Arrays;

class sorting{
    public static int[] merge(int []arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left1=merge(Arrays.copyOfRange(arr,0, mid));
        int[] right1=merge(Arrays.copyOfRange(arr, mid, arr.length));
        return mergesort(left1,right1);
    }
    public static int[] mergesort(int left[],int right[]){
        int []re=new int[left.length+right.length];
        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                re[k++]=right[j++];
            }
            else{
                re[k++]=left[i++];
            }
        }
        while(i<left.length){
            re[k++]=left[i++];
        } 
        while(j<right.length){
            re[k++]=right[j++];
        } 
        return re;

    }
}
public class merge_sort {
    public static void main(String []args){
        int []arr1={4,2,1,6,8,1,3,6};
        arr1=sorting.merge(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    
}
