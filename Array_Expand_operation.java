import java.util.*;
class array{
    int []arr=new int[5];
    int capacit=5;
    int size=0;
    void add(int a){
        if(size==capacit){
            expand();
        }
        arr[size++]=a;
    }
    void del(){
        arr[size--]=0;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
    void expand(){
        capacit *=2;
        int []temp=new int[capacit];
        for(int i=0;i<size;i++){
            temp[i]=arr[i];

        }
        arr=temp;
    }
}
public class Array_Expand_operation{
    public static void main(String []args){
        array a=new array();
        while(true){
            System.out.println();
            System.out.println("1 for add");
            System.out.println("2 for display");
            System.out.println("3 for delete");
            Scanner scan=new Scanner(System.in);
            int val=scan.nextInt();
            switch(val){
                case 1:System.out.println("enter value");
                        int add=scan.nextInt(); 
                        a.add(add);
                        break;
                case 2:a.display();
                        break;
                case 3:a.del();
                        break;
                case 5:System.exit(0);
            }
        }    
    }
}