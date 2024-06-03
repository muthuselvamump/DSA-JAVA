class Node{
    int Data;
    Node next;
}
class Linkedlist{
    Linkedlist(){
        head=null;
    }
    Node head;
    public void insertatbegin(int val){
        Node newnode=new Node();
        if(head ==null){
            newnode.Data=val;
            newnode.next=null;
        }
        else{
            newnode.Data=val;
            newnode.next=head;
            head=newnode;
        }
    }

}
public class Linked_List_implementation {
    public static void main(String []args){
        Linkedlist linklist=new Linkedlist();
        linklist.insertatbegin(10);
    }
    
}