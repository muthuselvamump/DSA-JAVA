class avltree{

nodeavl root;

public avltree(int val){
    root=new nodeavl(val);
}

class nodeavl{
    int key;
    nodeavl left;
    nodeavl right;

public nodeavl(int val){
    key=val;
    left=null;
    right=null;
}

  }
  public void insert(int val){
    insert(root ,val);
  }
public nodeavl insert(nodeavl root,int val){
    if(root==null){
        return new nodeavl(val);
    }
    if(val>root.key){
        root.right=insert(root.right,val);
    }
    if(val<root.key){
        root.left=insert(root.left,val);
    }
    return root;
}
public nodeavl inorder(nodeavl root){
    if(root !=null){
        inorder(root.left);
        System.out.print(root.key+ " " );
        inorder(root.right);
    }
    return root;
}


}

public class AVL_Tree {
    public static void main(String args[]){
        avltree n1=new avltree(50);
        n1.insert(40);
       n1.insert(20);
        n1.insert(25);
        n1.insert(10);
        n1.insert(70);
        n1.insert(60);
        n1.insert(90);
        n1.insert(85);
        n1.insert(95);
        n1.insert(75);
        n1.insert(96);
        n1.inorder(n1.root);

    }
    
}
