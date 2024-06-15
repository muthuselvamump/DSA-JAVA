class node{
    node next;
    int data;
}
class Clist{
    node head;
    Clist(){
        head=null;
    }
    public void insertatbegin(int val1){
        node temp=new node();
        if(head==null){
            temp.data=val1;
            temp.next=head;
            head=temp;
        }
        else{
            temp.data=val1;
            temp.next=head;
            head=temp;
        }
    
    }
    public void display(){
     node temp=head;
     while(temp.next!=head){
        System.out.println(temp.data);
        temp=temp.next;
     }   
    }

}
public class Circular_Linked_List {
    public static void main(String[] args) {
        Clist list1=new Clist();
        list1.insertatbegin(8);
        list1.insertatbegin(5);
        list1.insertatbegin(12);
        list1.insertatbegin(43);
        list1.display();





    }
    
}
