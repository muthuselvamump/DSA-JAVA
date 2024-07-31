class NodeC{
    int Data;
    NodeC next;

}
class circularlist{
    NodeC Head;
public void insertbegin(int val){
    NodeC temp=new NodeC();
    if(Head==null){
        temp.Data=val;
        temp.next=temp;
        Head=temp;
    }
    else{
        temp.Data=val;
        temp.next=Head.next;
        Head.next=temp;
    }
    
}
public void display(){
    NodeC temp=Head;
    if(Head==null){
        System.out.println("list empty");
    }
    else{
    do{
        
        temp=temp.next;
        System.out.print(temp.Data + "  ");
    }while(temp != Head);
    System.out.println();
}

}
public void deleteatbeginc(){
    NodeC temp=Head;
    if(temp==null){
        System.out.println("list is empty");
    }
    if(temp.next==temp){
        Head=null;
    }
    else{
        NodeC prev=temp.next;
        temp.next=prev.next;
    }

}
public void deletatlastc(){
    NodeC temp=Head;
    NodeC prev=new NodeC();
    if(temp==null){
        System.out.println("list is empty");    
    }
    else if(temp.next==temp){
        Head=null;
    }
    else{
        while(prev.next!=Head){
            prev=temp;
            temp=temp.next;

        }
        prev.next=temp.next;
        Head=prev;
    }

}

}

public class Circular_Linked_List {
    public static void main(String args[]) {
        circularlist clist=new circularlist();
        clist.insertbegin(51);
        clist.insertbegin(52);
        clist.insertbegin(53);
        clist.insertbegin(54);
        clist.insertbegin(56);
        //System.out.println(clist.Head);
        clist.display();
        clist.deleteatbeginc();
        clist.display();
        System.out.println("deletelast");
       // clist.deleteatbeginc();
        clist.deletatlastc();
        clist.display();
        }
}
