class btree{
    class nodebree{
        nodebree left;
        nodebree right;
        int Data;
        nodebree(int d){
            Data=d;
            left=null;
            right=null;
        }
    }
    nodebree root;
    btree(int d){
        root=new nodebree(d);
    }
    public void insertleft(nodebree n,int l){
        nodebree newnode=new nodebree(l);
        n.left=newnode;
    }
    public void insertatright(nodebree n,int r){
        nodebree newnode=new nodebree(r);
         n.right=newnode;
    }
    public static void PreOrder(nodebree root){

        if(root != null){
            System.out.print(root.Data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

    }
    public static void InOrder(nodebree root){

            if(root != null){
                InOrder(root.left);
                System.out.print(root.Data + " ");
                InOrder(root.right);
            }
    
    }
    public static void PostOrder(nodebree root){

        if(root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.Data + " ");
        }

}

}
public class Binarytreedemo {
    public static void main(String args[]){
        btree binarytree=new btree(10);
        binarytree.insertleft(binarytree.root, 5);
        binarytree.insertleft(binarytree.root.left, 3);
        binarytree.insertatright(binarytree.root.left, 8);
        binarytree.insertatright(binarytree.root, 15);
        binarytree.insertleft(binarytree.root.right, 12);
        System.out.println("pre order");
        btree.PreOrder(binarytree.root);
        System.out.println();
        System.out.println("in order");
        btree.InOrder(binarytree.root);
        System.out.println();
        System.out.println("post order");
        btree.PostOrder(binarytree.root);

    }
}
