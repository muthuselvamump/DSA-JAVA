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
    
}
public class Binary_Search_Tree {
    public static void main(String args[]){


    }
    
}
