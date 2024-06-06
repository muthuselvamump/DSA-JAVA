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
            System.out.print(temp.Data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insertatend(int end){
     Node temp=head;
     while(temp.next != null){
        temp=temp.next;
     }
     Node endn=new Node();
     endn.Data=end;
     endn.next=null;
     temp.next=endn;
     

    }
    public void insertatpos(int po,int va){
        if(head==null){
            System.out.println("LinkedList Is Empty");
        }
    }

}
public class Linked_List_implementation {
    public static void main(String []args){
        Linkedlist linklist=new Linkedlist();
        linklist.insertatbegin(10);
        linklist.insertatbegin(8);
        linklist.display();
        linklist.insertatend(5);
        linklist.display();
        linklist.insertatpos(2,99);

    }
    
}