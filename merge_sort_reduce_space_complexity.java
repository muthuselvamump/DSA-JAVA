class mergesortspace{
    public static void mergesortinplace(int arr[],int start,int end){
        if(start-end==1){
            return;
        }
        int mid=(start+end)/2;
        mergesortinplace(arr, start, mid);
        mergesortinplace(arr, mid, end);
    }
}
public class merge_sort_reduce_space_complexity {
    public static void main(String []args){

    }
    
}
