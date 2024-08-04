class queue{
    int size=-1;
    int arr[]=new int[5];
    int locator=-1;
    public void enqueue(int q){
        arr[++size]=q;

    }
    public void dequeue(){
        if(locator==size){
            System.out.println("queue is empty");
        }
        else{
        System.out.println(arr[++locator]);
        }
    }

}
public class Queue_Data_Structure{
    public static void main(String []args){
        queue q1=new queue();
        q1.enqueue(11);
        //q1.enqueue(12);
        //q1.enqueue(13);
        //q1.enqueue(14);
        q1.dequeue();
        q1.dequeue();
    }
}