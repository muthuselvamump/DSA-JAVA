class mergesortspace{
    public static void mergesortinplace(int arr[],int start,int end){
        if(start-end==1){
            return;
        }
        int mid=(start+end)/2;
        mergesortinplace(arr, start, mid);
        mergesortinplace(arr, mid, end);
        mergeing(arr, start, end, mid);
    }
    public static void mergeing(int arr[],int st,int en,int mi){
        
    }
}
public class merge_sort_reduce_space_complexity {
    public static void main(String []args){

    }
    
}
