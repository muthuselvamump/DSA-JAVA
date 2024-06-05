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
            head=newnode;
        }
        else{
            newnode.Data=val;
            newnode.next=head;
            head=newnode;
        }
    }
    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.Data);
            temp=temp.next;
        }
    }
    public void insertatend(int end){
        
    }

}
public class Linked_List_implementation {
    public static void main(String []args){
        Linkedlist linklist=new Linkedlist();
        linklist.insertatbegin(10);
        linklist.insertatbegin(8);
        linklist.display();
        linklist.insertatend(5);
    }
    
}