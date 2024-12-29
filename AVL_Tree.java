class avltree{

nodeavl root;

public avltree(int val){
    root=new nodeavl(val);
}

class nodeavl{
    int key;
    nodeavl left;
    nodeavl right;
    int height;

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
public void delete(int val){
    root=delete(root,val);
}
public nodeavl delete(nodeavl root,int val){
   if(root==null){
    return root;
   }

    if(root.key>val){
        root.left=delete(root.left,val);
    }
    else if(root.key<val){
        root.right=delete(root.right, val);
    }
    else{
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        else{
            root.key=min(root.right);
            root.right=delete(root.right,root.key);

        }
        
    }
    return root;
}
public int min(nodeavl root){
    nodeavl temp=new nodeavl(0);
    while(root !=null){
        temp=root;
        root=root.left;
    }
    return temp.key;

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
        n1.delete(100);
        System.out.println();
        n1.inorder(n1.root);

    }
    
}
