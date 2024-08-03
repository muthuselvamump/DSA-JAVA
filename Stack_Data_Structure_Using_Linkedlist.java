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
}
public class Stack_Data_Structure_Using_Linkedlist {
    public static void main(String []args){
    stackl stacklink=new stackl();

        stacklink.push(7);
        stacklink.push(8);
        stacklink.push(9);
        stacklink.display();
    }
}
