class bsearch{
    class nodebs{
        int key;
        nodebs left;
        nodebs right;
        public nodebs(int val){
            key=val;
            left=null;
            right=null;
        }
    }
    nodebs root;
    public bsearch(int val){
        root=new nodebs(val);
    }
    public void insert(int val){
        //insert(root,val);
        whileinsert(root,val);
        //System.out.println("return value"+temp.key);
    }
    public void whileinsert(nodebs root,int val){
        nodebs temp=root;
        nodebs prev=new nodebs(0);
        while(temp != null){
            if(temp.key>val){
                prev=temp;
                temp=temp.left;
            }
            else{
                prev=temp;
                temp=temp.right;
            }
        }
        if(prev.key>val){
            prev.left=new nodebs(val);
        }
        else{
            prev.right=new nodebs(val);
        }
    }
    public void search(nodebs root,int val){
        nodebs temp=root;
        while(temp !=null){
            if(temp.key==val){
                System.out.println("found");
                return;
            }
            if(temp.key>val){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
            
        }
            System.out.println("not found");

    }
    public nodebs insert(nodebs root,int val){
        if(root ==null){
            return new nodebs(val);
        }
        if(val > root.key){
            root.right=insert(root.right, val);
        }
        else{
            root.left=insert(root.left,val);
        }
        //nodebs test=new nodebs(5);
        return root;
        
    }
    public void inorder(nodebs root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
    }
    public void delete(int val){
        root=delete(root,val);
    }
    public nodebs delete(nodebs root, int val){
        if(root == null){
            return root;
        }
        if(root.key>val){
            root.left=delete(root.left,val);
        }
        else if(root.key<val){
            root.right=delete(root.right,val);
        }
        else{
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            else{
                root.key=min(root.right);
              //  System.out.println("root key"+root.key);
               //root.right=
               root.right=delete(root.right,root.key);//90
              //  return root;             

            }
        }
        return root;
    }
    public int min(nodebs root){
        nodebs temp=root;
        nodebs prev=new nodebs(0);
        while(temp!=null){
            prev=temp;
            temp=temp.left;
        }
        return prev.key;
    }
    
}
public class Binary_Search_Tree {
    public static void main(String args[]){
        bsearch n=new bsearch(50);
        n.insert(40);
       n.insert(20);
        n.insert(25);
        n.insert(10);
        n.insert(70);
        n.insert(60);
        n.insert(90);
        n.insert(85);
        n.insert(95);
        n.insert(75);
        n.insert(96);
        n.inorder(n.root);
       n.search(n.root, 90);
       System.out.println();
        n.inorder(n.root);
        System.out.println();
        n.delete( 70);
        n.delete(40);
        n.delete( 95);
        n.inorder(n.root);




    }
    
}
