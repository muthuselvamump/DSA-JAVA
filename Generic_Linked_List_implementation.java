import java.util.Iterator;

class Node1<T>{
    T Data;
    Node1 next;
}
class Linkedlist1<T> implements Iterable{
    Linkedlist1(){
        head=null;
    }
    Node1 head;
    public void insertatbegin(T val){
        Node1 newnode=new Node1();
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
        Node1 temp=head;
        while(temp != null){
            System.out.print(temp.Data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insertatend(T end){
     Node1 temp=head;
     while(temp.next != null){
        temp=temp.next;
     }
     Node1 endn=new Node1();
     endn.Data=end;
     endn.next=null;
     temp.next=endn;
     

    }
    public void insertatpos(int po,T va){
        Node1 temp=head;
        Node1 n=new Node1();
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
        Node1 temp=head;
        Node1 prev=head;
        for(int i=1;i<=posd;++i){
            if(i==posd-1){
                prev=temp;
            }
            temp=temp.next;

        }
        prev.next=temp;
    }
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node1 temp=head;
            public boolean hasNext(){
                return temp!=null;
            }
           public T next(){
                T rval=(T) temp.Data;
                temp=temp.next;
                return rval;
            }

        };
    }

}
public class Generic_Linked_List_implementation{
    public static void main(String []args){
        Linkedlist1<String> linklist=new Linkedlist1<String>();
        linklist.insertatbegin("hello");
        linklist.insertatbegin("worl");
        linklist.display();
        linklist.insertatend("java");
        linklist.display();
        linklist.insertatpos(2,"developer");
        linklist.display();
        //linklist.deleteatpos(2);
        linklist.display();
        linklist.insertatbegin("dsa");
        linklist.insertatbegin("oops");
        linklist.display();
        linklist.deleteatpos(6);
        linklist.display();
        System.out.println("for each loop");
        for(Object a:linklist){
            System.out.println(a);
        }

    }
    
}
