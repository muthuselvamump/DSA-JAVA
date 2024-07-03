class LinkList{
    Nodes Head;
    LinkList(){
        Head=null;
    }
class Nodes{
    int Data;
    Nodes next;

}
public void insertat(int a){
    Nodes temp=new Nodes();
    if(Head == null){
        temp.next=null;
        temp.Data=a;
        Head=temp;
    }
    else{
        temp.Data=a;
        temp.next=Head;
        Head=temp;
    }

}

public void Displayrev(){
    Nodes temp=Head;
    while(temp!=null){
        System.out.print(" "+temp.Data);
        temp=temp.next;
    }
}
public void reverse(){
    if(Head==null){
        System.out.println("list only have single element");
    }
    else{
        Nodes prev=null;
        Nodes curent=Head;
        Nodes next=Head.next;
        while(curent!=null){
            next=curent.next;
            curent.next=prev;
            prev=curent;
            curent=next;
        }
        Head=prev;
    }
}



}
public class Linked_List_Reverse {
    public static void main(String args[]){
    LinkList listrev=new LinkList();
    listrev.insertat(85);
    listrev.insertat(25);
    listrev.insertat(825);
    listrev.insertat(89);
    listrev.Displayrev();
    listrev.reverse();
    System.out.println("After Reversed");
    listrev.Displayrev();

}
}
