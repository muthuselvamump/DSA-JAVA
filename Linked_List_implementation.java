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
        Node temp=head;
        Node n=new Node();
        n.Data=va;
        if(head==null){
            System.out.println("LinkedList Is Empty");
        }
        else{
            for(int i=1;i<po-1;i++){
                temp=temp.next;
            }
        }
        n.next=temp.next;
        temp.next=n;
    }
    public void deleteatpos(int posd){
        Node temp=head;
        Node prev=head;
        for(int i=1;i<=posd;++i){
            if(i==posd-1){
                prev=temp;
            }
            temp=temp.next;

        }
        prev.next=temp;
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
        linklist.display();
        //linklist.deleteatpos(2);
        linklist.display();
        linklist.insertatbegin(20);
        linklist.insertatbegin(18);
        linklist.display();
        linklist.deleteatpos(6);
        linklist.display();

    }
    
}