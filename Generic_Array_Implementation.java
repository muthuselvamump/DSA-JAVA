import java.util.*;
public class Generic_Array_Implementation{
    int point;
    int inticapacity=5;
    int []arr;
    public Generic_Array_Implementation(){
        point=-1;
        arr=new int[inticapacity];
    }
    public void expandarr(){
        arr=Arrays.copyOf(arr,inticapacity*2);
        inticapacity*=2;
    }
    public void addvalue(int a){
        if(point==inticapacity-1){
            expandarr();
        } 
        arr[++point]=a;
    }
    public void deleteind(int index){
        int vali=arr[index+1];
        for(int i=index;i<=point;i++){
            if(i==point){
                arr[i]=0;
                break;
            }
            arr[i]=arr[i+1];

        }
    }
    public void display(){
        System.out.println();
        for (int i=0;i<=point;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String []args){
       Generic_Array_Implementation ar=new Generic_Array_Implementation();
        while(true){
            System.out.println("1 for add Element");
            System.out.println("2.delete Element");
            System.out.println("5 for stop");
            Scanner scan=new Scanner(System.in);
            int arrnum=scan.nextInt();
            switch(arrnum){
                case 1:{
                    System.out.println("Enter a element");
                    int va=scan.nextInt();
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
                }
            }
        }
    }
}