import java.util.*;
class insertion{
 public static void sort(int arr[]){
    int temp=0;
    for(int i=1;i<arr.length;i++){
        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
 }
}
public class Insertion_Sort{
    public static void main(String args[]){
        int arr[]={3,1,4,2,6,66,77,22,11};
        insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}