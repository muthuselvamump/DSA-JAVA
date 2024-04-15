import java.util.*;
public class Array_search_operation {
    public static void main(String []args){
        int []arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i;
        }
    System.out.println("enter element");
    Scanner scan=new Scanner(System.in);
    int ele=scan.nextInt();
    boolean b=true;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==ele){
            System.out.println("element index: "+ i);
            b=false;
        }
    }
    if(b==true){
        System.out.println("Element is not present");
    }
    }
    
}
