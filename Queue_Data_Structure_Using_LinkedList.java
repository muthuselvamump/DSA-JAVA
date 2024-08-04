class nodeql{
    int Data;
    nodeql next;
}
class queuelink{
    nodeql head;
    public void enqueue(int ql){
        nodeql temp=new nodeql();
        if(head==null){
            temp.Data=ql;
            temp.next=null;
        }
        else{
            temp.Data=ql;
            temp.next=head;
        }
        head=temp;
    }
    public void display(){
        nodeql temp=head;
        while(temp!=null){
            System.out.println(temp.Data);
            temp=temp.next;
        }
    }
    public void dequeue(){
        nodeql temp=head;
        nodeql prev=new nodeql();
        nodeql temp1=new nodeql();
        if(head==null){
            System.out.println("ques is empty");
        }
        else if(head.next==null){
            System.out.println(head.Data);
            head=null;
        }
        else{
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
            temp1=temp.next;

        }
        System.out.println(temp.Data);
        prev.next=null;

    }
    }
}
public class Queue_Data_Structure_Using_LinkedList{
    public static void main(String []args){
        queuelink ql1=new queuelink();
        ql1.enqueue(54);
        ql1.enqueue(55);
        ql1.enqueue(56);
        ql1.enqueue(57);
        //ql1.display();
        ql1.dequeue();
        ql1.dequeue();
        ql1.dequeue();
        ql1.dequeue();
        ql1.dequeue();
        ql1.dequeue();


    }
}