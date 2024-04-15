import java.util.*;
class insert{
    public int[] inserts(int []arr,int index,int val){
        int []arr1=arr;
        int temp=0;
        for(int i=index;i<arr1.length;i++){
            temp=arr1[i];
            arr1[i]=val;
            val=temp;



        }
        
        return arr1;
    }

}
public class Array_insert_operation {
    public static void main(String args[]){
        int []arr=new int[10];
        for(int i=0;i<5;i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        insert i=new insert();
        arr=i.inserts(arr, 2, 10);
        System.out.println(Arrays.toString(arr));
    }
    
}

