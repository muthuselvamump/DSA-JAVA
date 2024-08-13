class Binsearch{
    public static int find(int []ar1,int target){
        int start=0;
        int end=ar1.length-1;
       //int mid;
       if(ar1[0]<ar1[ar1.length-1]){
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
    }
    else{
        
    }
        return -1;
    }
}
public class Binary_Search {
    public static void main(String args[]){
        int arr[]={1,3,5,6,8,9,11,15};
        int arr2[]={25,22,16,11,8,7,5,2,1};
    System.out.println(Binsearch.find(arr,9));
    }
    
}
