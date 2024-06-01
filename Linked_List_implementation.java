class node{
    int Data;
    node head;
    node next;
    node(){
        head.next=null;
    }
    void insertatbegin(int a){
        head.Data=a;

    }
}
public class Linked_List_implementation {
    public static void main(String []args){
        node linklist=new node();
        linklist.insertatbegin(10);
    }
    
}

0