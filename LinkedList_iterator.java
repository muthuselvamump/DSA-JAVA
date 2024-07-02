import java.util.Iterator;

class iter implements Iterator<T>{
    
}

class Linkedlist2<T>{
    Linkedlist2(){
        head=null;
    }
    class Node2{
        T Data;
        Node2 next;
    }
    Node2 head;
    public void insertatbegin(T val){
        Node2 newnode=new Node2();
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
        Node2 temp=head;
        while(temp != null){
            System.out.print(temp.Data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insertatend(T end){
     Node2 temp=head;
     while(temp.next != null){
        temp=temp.next;
     }
     Node2 endn=new Node2();
     endn.Data=end;
     endn.next=null;
     temp.next=endn;
     

    }
    public void insertatpos(int po,T va){
        Node2 temp=head;
        Node2 n=new Node2();
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
        Node2 temp=head;
        Node2 prev=head;
        for(int i=1;i<=posd;++i){
            if(i==posd-1){
                prev=temp;
            }
            temp=temp.next;

        }
        prev.next=temp;


}
}
public class LinkedList_iterator{
    public static void main(String []args){
        Linkedlist2<String> linklist=new Linkedlist2<String>();
        linklist.insertatbegin("hello");
        linklist.insertatbegin("worl");
        //linklist.display();
        linklist.insertatend("java");
        //linklist.display();
        linklist.insertatpos(2,"developer");
        //linklist.display();
        //linklist.deleteatpos(2);
       // linklist.display();
        linklist.insertatbegin("dsa");
        linklist.insertatbegin("oops");
        linklist.display();
        linklist.deleteatpos(6);
        linklist.display();
        System.out.println("for each loop");
        /*for(Object a:linklist){
            System.out.println(a);
        }*/

    }
    
} 