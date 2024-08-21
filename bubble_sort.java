import java.util.*;
class bubble{
    public static void sort(int arr[]){
        int count=arr.length-1;
        int temp=0;
        boolean flag;
        for(int i=0;i<arr.length-1;i++){
            flag=false;
            for(int j=0;j<count;j++){
                if(arr[j]>arr[j+1]){
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  flag=true;  
                }
            }
            if(!flag){
                break;
            }
            count--;
        }
    }
}
public class bubble_sort {
    public static void main(String []args){
        int []p={2,1,5,32,1,4,2,55,33,22};
        bubble.sort(p);
        System.out.println(Arrays.toString(p));
    }
    
}
