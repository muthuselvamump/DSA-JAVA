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
    do{
        System.out.println(temp.Data);
        temp=temp.next;
    }while(temp != Head);

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
    }

}
