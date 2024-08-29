import java.util.*;
class mergesortspace{
    public static void mergesortinplace(int arr[],int start,int end){
        if(start-end<=1){
            return;
        }
        int mid=(start+end)/2;
        mergesortinplace(arr, start, mid);
        mergesortinplace(arr, mid, end);
        mergeing(arr, start, end, mid);
    }
    public static void mergeing(int arr[],int st,int en,int mi){
        int k[]=new int[st-en];
        int i=st,k1=0,j=mi;
        while(i < mi && j<en){
            if(arr[i]<=arr[j]){
                k[k1++]=arr[i++];
            }
            else{
                k[k1++]=arr[j++];
            }
        }

        while(i<mi){
            k[k1++]=arr[i++];
        }
        while(j<en){
            k[k1++]=arr[j++];
        }

    }
}
public class merge_sort_reduce_space_complexity {
    public static void main(String []args){
        int aq1[]={2,1,3,4,2,5,6,2,1};
        mergesortspace.mergesortinplace(aq1, 0, aq1.length);
        System.out.println(Arrays.toString(aq1));
    }
    
}
