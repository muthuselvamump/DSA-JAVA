class node{
    int Data;
    node head;
    node next;
    node(){
        head=null;
    }
    void insertatbegin(int a){
        node nextq=new node();
        if(head == null){
            head.Data=a;
            head.next=null;
        }
        nextq.Data=a;
        nextq.next=head;
        head=nextq;




    }
}
public class Linked_List_implementation {
    public static void main(String []args){
        node linklist=new node();
        linklist.insertatbegin(10);
    }
    
}