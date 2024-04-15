import java.util.*;
class delete{
    public int[] delets(int arr[],int index){
        int arr1[]=new int[2];
        for(int i=index;i<arr.length;i++){
            if(i==arr.length-1){
                arr[i]=0;
            }
            else{
            arr[i]=arr[i+1];
            }
        }
                return arr;
    }

}
public class Array_delete_operation {
    public static void main(String []args){
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        delete d=new delete();
        d.delets(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    
}
