class stack{
    int size=4;
    int[]arr=new int[size];
    int count=0;
    public void push(int p){
        if(count==size){
            System.out.println("stack is full we cant push value:- "+p);
        }
        else{
        arr[count]=p;
        count++;
        }
    }
    public void pop(){
        if(count==0){
            System.out.println("empty stack");
        }
        else{
        System.out.println(arr[--count]);
        }
    }

}
public class Stack_Data_Structure {
    public static void main(String []args){
        stack s1=new stack();

        s1.push(4);
        s1.push(5);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.pop();
        s1.pop();

    }
    
}
