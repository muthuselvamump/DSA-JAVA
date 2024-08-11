class min{
    public static int findmin(int []arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;

    }
}
public class find_min {
    public static void main(String args[]){
        int ar2[]={-5,1,3,4,5,2,5,9,-1};
        System.out.println(min.findmin(ar2));
    }
}
