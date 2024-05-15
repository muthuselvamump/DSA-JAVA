import java.util.*;
public class Generic_Array_Implementation<T>{
    int point;
    int inticapacity=5;
    T []arr;
    @SuppressWarnings("unchecked")
    public Generic_Array_Implementation(){
        point=-1;
        arr=(T[])new Object[inticapacity];
    }
    public void expandarr(){
        arr=Arrays.copyOf(arr,inticapacity*2);
        inticapacity*=2;
    }
    public void addvalue(T a){
        if(point==inticapacity-1){
            expandarr();
        } 
        arr[++point]=a;
    }
    public void deleteind(int index){
        for(int i=index;i<=point;i++){
            if(i==point){
                arr[i]=null;
                break;
            }
            arr[i]=arr[i+1];

        }
        point--;
    }
    public void display(){
        System.out.println();
        for (int i=0;i<=point;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String []args){
       Generic_Array_Implementation<String> ar=new Generic_Array_Implementation<String>();
        while(true){
            System.out.println("1 for add Element");
            System.out.println("2.delete Element");
            System.out.println("3:for display the element");
            System.out.println("9 for stop");
            Scanner scan=new Scanner(System.in);
            int arrnum=scan.nextInt();
            scan.nextLine();
            switch(arrnum){
                case 1:{
                    System.out.println("Enter a element");
                    String va=scan.nextLine();
                    ar.addvalue(va);
                    break;
                }
                case 2:{
                    System.out.println("Enter the index");
                    int ind=scan.nextInt();
                    ar.deleteind(ind);
                    break;
                }
                case 3:{
                    ar.display();
                    break;
                }
                case 9:{
                    System.exit(0);
                }
            }
        }
    }
}