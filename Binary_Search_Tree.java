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
        insert(root,val);
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
        n.inorder(n.root);





    }
    
}
