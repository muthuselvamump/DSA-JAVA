import java.util.*;
class selectsort{
    public static int[] sorting(int []arr){
        int min=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            arr[index]=arr[i];
            arr[i]=min;
        }
        return arr;
    }
}
public class Selection_Sort {
    public static void main(String []args){
       
    }
}
