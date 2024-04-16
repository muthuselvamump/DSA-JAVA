import java.util.*;
class dynamic_array{
    final int intialcapacity=5;
    private int arr[];
    private int capacity;
    private int size;
    dynamic_array(){
        size=0;
        arr=new int[intialcapacity];
        capacity=intialcapacity;
    }
    public void insert(int a){
        if(size==capacity){
            extend();
        }
        arr[size++]=a;
    }
    private void extend(){
        capacity*=2;
        arr=Arrays.copyOf(arr, capacity);
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void insertpart(int inde,int va){
        int temp;
        if(size ==capacity-1)
        {
         extend();   
        }
        for(int i=inde;i<capacity;i++){
            temp=arr[i];
            arr[i]=va;
            va=temp;
        }
        ++size;
    }
    void delete(int ind){
        for(int i=ind;i<arr.length;i++){
            if(i==arr.length-1){
                arr[i]=0;
                break;
            }
            arr[i]=arr[i+1];
        }
        if(capacity>intialcapacity && capacity>size*3){
            shrink();
        }
        --size;

    }
    void shrink(){
        capacity/=2;
        arr=Arrays.copyOf(arr, capacity);

    }
    void search(int val){
        int flag=0;
        for(int i=0;i<size;i++){
            if(arr[i]==val){
                System.out.println("index is : "+i);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Not present in Array List");
        }

    }

}
public class Array_list_implementation {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        dynamic_array list=new dynamic_array();
        outer:
        while(true){
        System.out.println("1.insert at end");
        System.out.println("2.insert into particular postion");
        System.out.println("3.print array element");
        System.out.println("4.delete a element");
        System.out.println("5.exit");
        int val=scan.nextInt();
        switch(val){
            case 1:System.out.println("enter value");
                    int end=scan.nextInt();
                    list.insert(end);
                    break;
            case 2:System.out.println("Enter the index");
                    int index=scan.nextInt();
                    System.out.println("Enter the value");
                    int value=scan.nextInt();
                    if(index<0){

                    }
                    list.insertpart(index,value);
                    break;
            case 3:list.display();
                    break;
            case 4:System.out.println("enter the index");
                    int delindex=scan.nextInt();
                    list.delete(delindex);
                    break;
 //           case 5:break outer;
            case 6:System.out.println("enter element");
                    int search=scan.nextInt();
                    list.search(search);
                    break;
            //System.exit(0);
            default:
                System.out.println("invalid selection");
        }
        
        }
    }
}
