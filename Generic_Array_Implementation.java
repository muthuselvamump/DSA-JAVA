import java.util.*;
public class Generic_Array_Implementation{
    int point;
    int inticapacity=5;
    int []arr;
    public Generic_Array_Implementation(){
        point=-1;
        arr=new int[inticapacity];
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
                    System.out.println("hello");
                    break;
                }
                case 2:{
                    System.out.println("world");
                    break;
                }
            }
        }
    }
}