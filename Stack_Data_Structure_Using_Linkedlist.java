class nodes{
    int Data;
    nodes next;
}
class stackl{
    nodes head;
    public stackl(){
        head=null;
    }
    public void push(int p){
        nodes temp=new nodes();
        if(head==null){
            temp.Data=p;
            temp.next=null;
        }
        else{
            temp.Data=p;
            temp.next=head;
        }
        head=temp;
    }
    public void display(){
        nodes temp=head;
        while(temp!=null){
            System.out.println(temp.Data);
            temp=temp.next;
        }
    }
    public void pop(){
        nodes temp=head;
        if(head==null){
            System.out.println("stack is Empty");
        }
        else{
            System.out.println(temp.Data);
            head=temp.next;
        }
    }
    public void peek(){
        System.out.println("peek data is : "+head.Data);
    } 
}
public class Stack_Data_Structure_Using_Linkedlist {
    public static void main(String []args){
    stackl stacklink=new stackl();

        stacklink.push(7);
        stacklink.push(8);
        stacklink.push(9);
        stacklink.pop();
        stacklink.pop();
        stacklink.peek();
    }
}
