import java.util.*;
class mergesortspaceb{
    public static void mergesortinplaceb(int arr[],int start,int end){
        if(start+1==end){
            return;
        }
        int mid=(start+end)/2;
        mergesortinplaceb(arr, start, mid);
        mergesortinplaceb(arr, mid, end);
        mergeingb(arr, start, mid,end );
    }
    public static void mergeingb(int arr[],int st,int mi,int en){
        int index=en-st;
        for(int l=st;l<en-st;l++){
            for(int l1=st;l1<index-1;l1++){
                if(arr[l1]>arr[l1+1]){
                    int temp=arr[l1+1];
                    arr[l1+1]=arr[l1];
                    arr[l1]=temp;
                }
            }
           index--;
        }

    }
}
public class mergsort_combine_bupple {
    public static void main(String []args){
        int arr[]={4,1,3,2,1,5};
        mergesortspaceb.mergesortinplaceb(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
}





