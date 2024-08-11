class max{
    public static int findmax(int []arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
public class find_max {
    public static void main(String args[]){
        int ar1[]={8,2,3,1,0,9,6,1,3,11};
        System.out.println(max.findmax(ar1));
    }
}
