import java.util.*;
class adjacency_List{
   ArrayList<ArrayList> gal=new ArrayList<>();
   int sizea=0;
   boolean []che;
   // Stack<Integer> st=new Stack<>();
   adjacency_List(int val){
    for(int i=0;i<val;i++){
        gal.add(new ArrayList<Integer>());
    }
    che=new boolean[5];
   }
   public void add(int u,int v){
    gal.get(u).add(v);
    gal.get(v).add(u);

   }
   public void printal(){
    for(int i=0;i<gal.size();i++){
        System.out.println("ADJ Vertex"+" "+i);
        for (int k=0;k<gal.get(i).size();k++){
            System.out.println(gal.get(i).get(k));
        }
    }
   }
   public void BFS(int v){
    Queue<Integer> q=new LinkedList<>();
    int sizeq=gal.size();
    boolean []ch=new boolean[gal.size()];

    q.add(v);
    ch[v]=true;

    while(q.size()!=0){
        int vert=q.remove();
        System.out.print(" "+vert);
        for(int i=0;i<gal.get(vert).size();i++){
            int ver=(int)gal.get(vert).get(i);
            if(ch[ver]!=true){
                q.add(ver);
                ch[ver]=true;
            }
        }
    }



   }
   public void DFS(int val){
    
    int vert=val;
    //st.add(vert);
    che[vert]=true;
    System.out.print(" "+vert);
    for(int i=0;i<gal.get(vert).size();i++){
        int verto=(int)gal.get(vert).get(i);
        
        if(che[verto]!=true){
            //che[verto]=true;
            DFS(verto);
        }
        
    }
   // return st.pop();

   }
    
}
public class Graph_refrenctace {
    public static void main(String args[]){
        adjacency_List al=new adjacency_List(5);
        int arr[][]={
        {0,1,0,0,1},
        {1,0,1,0,1},
        {0,1,0,1,0},
        {0,0,1,0,1},
        {1,1,0,1,0}};
        System.out.println("Adjecency matrix"+ " "+ arr[0][1]);
        //System.out.println(adjacency_List.gal.get(0));
            al.add(0, 1);
            al.add(1,2);
            al.add(2,3);
            al.add(3,4);
            al.add(4,1);
            al.add(4,0);
           // al.printal();
           System.out.println("BFS"); 
           al.BFS(0);
           System.out.println();
           System.out.println("DFS");
            al.DFS(0);
           // System.out.println(al.gal.size());


    }
    
}
