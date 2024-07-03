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
        System.out.println(temp.Data);
        temp=temp.next;
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
}
}
