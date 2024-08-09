class LinearSearch{
    public static int find(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}
public class Linear_Search_int {
    public static void main(String []args){
        int []arr={1,2,3,4,6};
        System.out.println(LinearSearch.find(arr, 3));
        System.out.println(LinearSearch.find(arr, 0));
        System.out.println(LinearSearch.find(arr,6));
    }
}
