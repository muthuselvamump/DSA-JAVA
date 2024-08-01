class stack{
    int[]arr=new int[10];
    int count=0;
    public void push(int p){
        count++;
        arr[count]=p;
    }
    public void pop(){
        System.out.println(arr[count--]);
    }

}
public class Stack_Data_Structure {
    public static void main(String []args){
        stack s1=new stack();

        s1.push(4);
        s1.push(5);
        s1.push(3);
        s1.push(2);
        s1.pop();
        s1.pop();

    }
    
}
