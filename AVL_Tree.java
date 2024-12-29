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
    height=0;
}

  }
  public int getheight(nodeavl node){
    if(node == null){
        return -1;
    }
    return node.height;
  }
  public void insert(int val){
    root=insert(root ,val);
  }
public nodeavl insert(nodeavl root,int val){
    if(root==null){
        return new nodeavl(val);
    }
    if(val>root.key){
        root.right=insert(root.right,val);
    }
    else if(val<root.key){
        root.left=insert(root.left,val);
    }
    else{
        return root;
    }
    root.height=1+max(getheight(root.left),getheight(root.right));
    /*if(val==75){
    System.out.println("rootkey"+root.key+"  updated  "+root.height);
    }*/
    int balancefactor=getbalce(root);
    //LL case
    if(balancefactor>1 && val<root.left.key){
        return rightrotate(root);
    }
    //LR case
    if(balancefactor>1 && val>root.left.key){
        root.left=leftrotate(root.left);
        return rightrotate(root);
    }
    //RR Case
    if(balancefactor<-1 && root.right.key>val ){
        return leftrotate(root);
    }
    //RL case
    if(balancefactor<-1 && root.right.key<val ){
        root.right=rightrotate(root.right);
        return leftrotate(root);
    }
     
    return root;
}
public int getbalce(nodeavl node){
    return getheight(node.left)-getheight(node.right);
}
public nodeavl leftrotate(nodeavl x){
    nodeavl y=x.left;
    nodeavl t3=y.right;

    y.right=x;
    x.left=t3;
    y.height=1+max(getheight(y.left),getheight(y.right));
    x.height=1+max(getheight(x.left),getheight(x.right));
    return y;



}
public nodeavl rightrotate(nodeavl x){
    nodeavl y=x.right;
    nodeavl t3=y.left;

    y.left=x;
    x.right=t3;
    y.height=1+max(getheight(y.left),getheight(y.right));
    x.height=1+max(getheight(x.left),getheight(x.right));
    return y;



}
public int max(int left,int right){
    return left>right?left:right;
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
       // n1.delete(100);
        //System.out.println();
        //n1.inorder(n1.root);

    }
    
}
