class Binsearch{
    public static int find(int []ar1,int target){
        int start=0;
        int end=ar1.length-1;
       //int mid;
        while(start<end){
            int mid=(start+end)/2;
            if(ar1[mid]>target){
                end=mid-1;
               // mid=(start+end)/2;
            }
            else if(ar1[mid]<target){
                  start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
public class Binary_Search {
    public static void main(String args[]){
        int arr[]={1,3,5,6,8,9,11,15};
    System.out.println(Binsearch.find(arr,9));
    }
    
}
