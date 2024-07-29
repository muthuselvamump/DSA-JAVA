class NodeD1 {
    int Data;
    NodeD1 prev;
    NodeD1 next;

}

class DList {
    NodeD1 Head;
    NodeD1 Tail;

    DList() {
        Head = null;
        Tail = null;
    }

    public void insert(int a) {
        NodeD1 temp = new NodeD1();
        if (Head == null) {
            temp.Data = a;
            temp.next = null;
            temp.prev = null;
            Tail = temp;
        } else {
            temp.Data = a;
            temp.next = Head;
            temp.prev = null;
            Head.prev = temp;
        }
        Head = temp;

    }

    public void Display() {
        NodeD1 temp = Head;
        while (temp != null) {
            System.out.println(temp.Data);
            temp = temp.next;
        }
    }

    public void Display1() {
        NodeD1 temp = Tail;
        while (temp != null) {
            System.out.println(temp.Data);
            temp = temp.prev;
        }
    }

}

public class Doubly_LinkedList {
    public static void main(String args[]) {
        DList doublelist = new DList();
        doublelist.insert(55);
        doublelist.insert(56);
        doublelist.insert(57);
        doublelist.insert(58);
        doublelist.Display();
        System.out.println("Tail via Manipulate");
        doublelist.Display1();
        System.out.println("trying direct access");
        System.out.println(doublelist.Tail.Data);

    }
}
