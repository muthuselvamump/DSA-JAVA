class queue{
    int size=-1;
    int arr[]=new int[10];
    int locator=-1;
    public void enqueue(int q){
        if(size==arr.length-1){
            System.out.println("queue is full");
        }
        else{
        arr[++size]=q;
        }    
    }
    public void dequeue(){
        if(size==-1){
            System.out.println("queue is empty");
        }
        else{
        System.out.println(arr[0]);
        size--;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                arr[i]=0;
            }
            else{
            arr[i]=arr[i+1];
            }
        }
    }
    }
}
public class Queue_Data_Structure{
    public static void main(String []args){
        queue q1=new queue();
        q1.enqueue(11);
        q1.enqueue(12);
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(112);
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(12);
        q1.dequeue();

    
    }
}