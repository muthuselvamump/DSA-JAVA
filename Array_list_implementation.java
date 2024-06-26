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
    void update(int indexup,int up){
        arr[indexup]=up;
    }
    void clear(){
        int []temp=new int[intialcapacity];
        arr=temp;
        size=0;
        capacity=intialcapacity;
    }
    void contains(int val){
        int flag=0;
        for(int i=0;i<size;i++){
            if(arr[i]==val){
                System.out.println("its contains");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("not contains");
        }
    }
    void insertatfront(int inser){
        if(size==capacity){
            extend();
        }
        int temp;
        for(int i=0;i<size;i++){
            temp=arr[i];
            arr[i]=inser;
            inser=temp;


        }
        size++;
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
        System.out.println("5.clear");
        System.out.println("6.for search");
        System.out.println("7.update");
        System.out.println("8.its contains");
        System.out.println("9.insert at front");
        System.out.println("10.exit");
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
            case 5:list.clear();
                    break;
            case 6:System.out.println("enter element");
                    int search=scan.nextInt();
                    list.search(search);
                    break;
            case 7:System.out.println("enter index");
            int indexup=scan.nextInt();
            System.out.println("eneter element");
            int up=scan.nextInt();
            list.update(indexup, up);
            break;
            case 8:System.out.println("enter the value");
                    int val1=scan.nextInt();
                    list.contains(val1);
                    break;
            case 9:System.out.println("enter element for insert at front");
                    int insefr=scan.nextInt();
                    list.insertatfront(insefr);
                    break;
            //System.exit(0);
            case 10:break outer;
            default:
                System.out.println("invalid selection");
        }
        
        }
    }
}
